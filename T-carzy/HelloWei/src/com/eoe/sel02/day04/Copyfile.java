package com.eoe.sel02.day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Copyfile {
	private static final String SRC_PATH="e:/tools";
	private static final String DEST_PATH="e:/java_test/se2_day04";
	private static ArrayList<String> taskList=new ArrayList<String>();
	private static ArrayList<String> tasks=new ArrayList<String>();
	static boolean isFinish=false;
	public static void main(String[] args) {
		initTaskList();
		final DownloadTask downloadTask=new DownloadTask();
		downloadTask.start();
		Thread ctrlThead=new Thread(){
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
				for(int i=0;i<taskList.size();i++){
					System.out.println(i+1+"-"+taskList.get(i));
				}
			}
		};
		ctrlThead.setDaemon(true);
		ctrlThead.start();
	}
	private static void initTaskList() {
		taskList.add("ChromeSetup.exe");
		taskList.add("eclipse-jee-kepler-SR1-win32-x86_64.zip");
		taskList.add("Fiddler2Setup.exe");
		taskList.add("genymotion-2.0.1.exe");
		taskList.add("genymotion-2.0.1-vbox.exe");
		taskList.add("Microsoft_DotNetFXCHS2.0.exe");
		taskList.add("quit");
	}
	static class DownloadTask extends Thread{
		@Override
		public void run() {
			while(!isFinish){
				while(!tasks.isEmpty()){
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

		private void download(String fileName) {
			FileInputStream fis=null;
			FileOutputStream fos=null;
			File srcFile=new File(SRC_PATH,fileName);
			if(!srcFile.exists()){
				System.out.println("文件不存在");
				return ;
			}
			try {
				fis=new FileInputStream(srcFile);
				File destFile=new File(DEST_PATH,fileName);
				fos=new FileOutputStream(destFile);
				byte[] buffer=new byte[1024];
				int len;
				while((len=fis.read(buffer))!=-1){
					fos.write(buffer, 0, len);
				}
				System.out.println(fileName+"复制完毕");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
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
}
