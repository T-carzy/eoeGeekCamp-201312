package com.eoe.se2.day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	private static final String SRC_PATH="D:/se2/src";
	private static final String DEST_PATH="D:/se2/dest";
	private static ArrayList<String> taskList=new ArrayList<String>();
	private static ArrayList<String> tasks=new ArrayList<String>();
	static boolean isFinish=false;
	public static void main(String[] args) {
		initTaskList();
		final DownloadTask downloadTask=new DownloadTask();
		downloadTask.start();
		Thread contralThread=new Thread(){
			@Override
			public void run() {
				Scanner scanner=new Scanner(System.in);
				while(true){
					showTaskList();
					int select;
					do{
						select=scanner.nextInt();
					}while(select<1||select>taskList.size());
					if(select==taskList.size()){
						isFinish=true;
						System.out.println("下载结束");
					}else{
						tasks.add(taskList.remove(select-1));
					}
					synchronized (downloadTask) {
					      downloadTask.notify();	
					}
				}
			}

			private void showTaskList() {
				for (int i = 0; i < taskList.size(); i++) {
					System.out.println(i+1+"-"+taskList.get(i));
				}
			}
		};
		contralThread.setDaemon(true);
		contralThread.start();

	}
	//初始化下載列表
	private static void initTaskList() {
		taskList.add("AndroidForCalculator(1).zip");
		taskList.add("CoreJava20131205.zip");
		taskList.add("Day05_.zip");
		taskList.add("Day09.zip");
		taskList.add("eoe201312.zip");
		taskList.add("quit");
	}
	static class DownloadTask extends Thread{
		@Override
		public void run() {
			while(!isFinish){
				while(tasks.size()>0&&!isFinish){
					download(tasks.remove(0));
				}
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	//複製文件
	static void download(String fileName){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File srcFile=new File(SRC_PATH, fileName);
		if(!srcFile.exists()){
			System.out.println("文件不存在");
			return;
		}
		try {
			fis=new FileInputStream(srcFile);
			File destFile=new File(DEST_PATH, fileName);
			fos=new FileOutputStream(destFile);
			byte[] data=new byte[1024];
			int len;
			while((len=fis.read(data))!=-1){
				fos.write(data,0,len);
			}
			System.out.println(fileName+"文件複製w完畢");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
