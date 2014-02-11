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

public class Test005 {

	static final String FILENAME="adt-bundle-windows-x86_64-20130522.zip";
	static final String SRC_PATH = "D:/se1/src/";
	static final String DEST_PATH = "D:/se1/dest/";
	static final String RECORD_FILE_NAME = "record.dat";
	static int position;
	static  long time;
	static enum Action{
		READY, DOWNLOADING,STOP;
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
			long time1=System.currentTimeMillis();
			System.out.println("下载中。。。");
			File src=new File(SRC_PATH, FILENAME);
			File dest=new File(DEST_PATH, FILENAME);
			RandomAccessFile in=null;
			RandomAccessFile out=null;
			try {
				in=new RandomAccessFile(src, "r");
				out=new RandomAccessFile(dest, "rw");
				int position=readLocation();
				in.seek(position);
				out.seek(position);
				int len;
				byte[] buffer=new byte[1024];
				while((len=in.read(buffer))!=-1&& action!=Action.STOP){
					out.write(buffer,0,len);
					position+=len;
				}
				if(action==Action.DOWNLOADING){
					System.out.println("下载结束");
					position=0;
					saveLoation(position);
				}else{
					System.out.println("下载被终止");
					saveLoation(position);
				}
				time=System.currentTimeMillis();
				System.out.println("copytime="+(time-time1));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(in!=null){
						in.close();
					}
					if(out!=null){
						out.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		static void saveLoation(int position) {
			File file=new File(DEST_PATH, RECORD_FILE_NAME);
			FileOutputStream fos=null;
			DataOutputStream dos=null;
			try {
				fos=new FileOutputStream(file);
				dos=new DataOutputStream(fos);
				dos.writeInt(position);
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

		static int readLocation() {
			int position=0;
			boolean isexists=true;
			File file=new File(DEST_PATH, RECORD_FILE_NAME);
			isexists=file.exists();
			DataInputStream in=null;
			DataOutputStream out=null;
			try {
				if(isexists){
					in=new DataInputStream(new FileInputStream(file));
					position=in.readInt();
				}else{
					out=new DataOutputStream(new FileOutputStream(file));
					out.writeInt(0);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(in!=null){
						in.close();
					}
					if(out!=null){
						out.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return position;
		}
		
	}

}
