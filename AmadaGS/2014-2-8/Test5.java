package com.eoe.se2.day04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test5 {

	static final String FILENAME="adt-bundle-windows-x86_64-20130522.zip";
	static final String SRC_PATH = "D:/se1/src/";
	static final String DEST_PATH = "D:/se1/dest/";
	static final String RECORD_FILE_NAME = "record.dat";
	enum Action{
		READY,DOWNLOADING,STOP
	}
	static Action action;
	
	public static void main(String[] args) {
		action=Action.READY;
		final DownloadTask downloadTask=new DownloadTask();
		downloadTask.start();
		Thread contralThread=new Thread(){
			@Override
			public void run() {
				Scanner scanner=new Scanner(System.in);
				System.out.println("1-开始下载\t2-下载终止");
				while(true){
					int select=scanner.nextInt();
					action=Action.values()[select];
					synchronized (downloadTask) {
					     downloadTask.notify();	
					}
				}
			}
		};
		contralThread.setDaemon(true);
		contralThread.start();
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
				}
			}
			//action=Action.DOWNLOADING;
			long time1=System.currentTimeMillis();
			System.out.println("下载中。。。");
			long pos=readLocation();
			RandomAccessFile srcRaf=null;
			RandomAccessFile destRaf=null;
			try {
				srcRaf=new RandomAccessFile(SRC_PATH+FILENAME,"r" );
				destRaf=new RandomAccessFile(DEST_PATH+FILENAME,"rw");
				srcRaf.seek(pos);
				destRaf.seek(pos);
				byte[] buffer=new byte[1024];
				int len;
				while((len=srcRaf.read(buffer))!=-1&&action==Action.DOWNLOADING){
					destRaf.write(buffer, 0, len);
					pos+=len;
				}
				if(action==Action.DOWNLOADING){
					pos=0;
					saveLocation(0);
					System.out.println("下载完毕");
				}else{
					System.out.println("下载终止");
					saveLocation(pos);
				}
				long time2=System.currentTimeMillis();
				System.out.println("copyTime="+(time2-time1));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
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

		private void saveLocation(long pos) {
			DataOutputStream dos=null;
			try {
				File file=new File(DEST_PATH, RECORD_FILE_NAME);
				dos=new DataOutputStream(new FileOutputStream(file));
				dos.writeLong(pos);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
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
			File file=new File(DEST_PATH, RECORD_FILE_NAME);
			FileInputStream fis=null;
			DataInputStream dis=null;
			DataOutputStream dos=null;
			try {
				if(!file.exists()){
					dos=new DataOutputStream(new FileOutputStream(file));
					dos.writeInt(0);
				}else{
					fis=new FileInputStream(file);
					dis=new DataInputStream(fis);
					pos=dis.readLong();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
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
