package com.eoe.se2.day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {

	static ArrayList<String> taskList = new ArrayList<String>();
	static ArrayList<String> tasks = new ArrayList<String>();
	static final String SRC_PATH = "d:/se2/day04";
	static final String DEST_PATH = "d:/se2/day04/dest/";

	public static void main(String[] args) {
		initTasks();
		final DownloadTasks downloadTasks = new DownloadTasks();
		downloadTasks.start();
		Thread controllThread = new Thread() {
			public void run() {
				while (true) {
					showTasks();
					int select;
					do {
						select = new Scanner(System.in).nextInt();
					} while (select < 1 || select > taskList.size() + 1);
					String task = taskList.remove(select - 1);
					tasks.add(task);
					synchronized (downloadTasks) {
						downloadTasks.notify();
					}
				}
			};
		};
		controllThread.setDaemon(true);
		controllThread.start();
	}

	static void initTasks() {
		taskList.add("eclipse-jee-indigo-win32.zip");
		taskList.add("dotnetfx.zip");
		taskList.add("imo_setuo.exe");
		taskList.add("ThinkingInJava4.pdf");
		taskList.add("quit");
	}
	static void showTasks(){
		for (int i = 0; i < taskList.size(); i++) {
			System.out.println(i+1+"-"+taskList.get(i));
		}
		System.out.println("\n通过数字选择下载任务");
	}

	static class DownloadTasks extends Thread {
		boolean isFinish = false;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (!isFinish) {
				while (!tasks.isEmpty() && !isFinish) {
					String file = tasks.remove(0);
					if (file.equals("quit")) {
						System.out.println("結束下載");
						isFinish = true;
					} else {
						download(file);
					}
				}
				if (!isFinish) {
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

		private void download(String file) {
			System.out.println("downloading...");
			FileInputStream fis = null;
			FileOutputStream fos = null;
			File srcFile = new File(SRC_PATH + file);
			File destFile = new File(DEST_PATH + file);
			byte[] data = new byte[1024];

			try {
				fis = new FileInputStream(srcFile);
				fos = new FileOutputStream(destFile);
				int len;
				while ((len = fis.read(data)) != -1) {
					fos.write(data, 0, len);
				}
				System.out.println(srcFile + "download success!");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (fos != null) {
						fos.close();
					}
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
