package com.eoe.sel02.day04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Stop {
	private static final String SRC_PATH="e:/tools/";
	private static final String DEST_PATH="e:/java_test/se2_day04/";
	private static final String FILE_NAME="eclipse-jee-kepler-SR1-win32-x86_64.zip";
	static final String RECORD_FILE_NAME="record.dat";
	enum Action{READY,DOWNING,STOP}
	static Action action;
	public static void main(String[] args) {
		action=Action.READY;
		final DownloadTask downloadTask=new DownloadTask();
		downloadTask.start();
		Thread ctrlThread=new Thread(){
			@Override
			public void run() {
				Scanner scanner=new Scanner(System.in);
				while(true){
					System.out.println("1-开始下载\t2-停止下载");
					int select=scanner.nextInt();
					action=Action.values()[select];
					synchronized (downloadTask) {
						downloadTask.notify();
					}
				}
			}
		};
		ctrlThread.setDaemon(true);
		ctrlThread.start();
	}
	static class DownloadTask extends Thread{
		@Override
		public void run() {
			if(action==Action.READY){
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					action=Action.DOWNING;
					long pos=readLocation();
					RandomAccessFile srcRaf=null;
					RandomAccessFile destRaf=null;
					try {
						srcRaf=new RandomAccessFile(SRC_PATH+FILE_NAME, "r");
						destRaf=new RandomAccessFile(DEST_PATH+FILE_NAME, "rw");
						srcRaf.seek(pos);
						destRaf.seek(pos);
						byte[] buffer=new byte[1024];
						int len;
						while((len=srcRaf.read(buffer))!=-1&&action==Action.DOWNING){
							destRaf.write(buffer,0,len);
							pos+=len;
						}
						if(action==Action.DOWNING){
							pos=0;
							saveLocation(pos);
							System.out.println("下载完毕");
						}else{
							System.out.println("下载被终止");
							saveLocation(pos);
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally{
						try {
							if(srcRaf!=null){
								srcRaf.close();
							}
							if(destRaf!=null){
								destRaf.close();
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

		private void saveLocation(long pos) {
			DataOutputStream dos=null;
			try {
				File file=new File(SRC_PATH,RECORD_FILE_NAME);
				dos=new DataOutputStream(new FileOutputStream(file));
				dos.writeLong(pos);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(dos!=null){
					try {
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		private long readLocation() {
			long pos=0;
			DataOutputStream dos=null;
			DataInputStream dis=null;
			File file=new File(SRC_PATH,RECORD_FILE_NAME);
			try {
				if(!file.exists()){
					file.createNewFile();
					dos=new DataOutputStream(new FileOutputStream(file));
					dos.writeLong(0);
				}else{
					dis=new DataInputStream(new FileInputStream(file));
					pos=dis.readLong();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					if(dis!=null){
						dis.close();
					}
					if(dos!=null){
						dos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return pos;
		}
	}
}
