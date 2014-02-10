package se2_day04_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {
	private static final String SRC_PATH = "E:/java_test/src";
	private static final String DEST_PATH = "E:/java_test/dest";
	// 用于显示、选择下载文件名的集合
	private static final ArrayList<String> tasklist = new ArrayList<String>();
	// 用于提供下载文件名的集合
	private static final ArrayList<String> tasks = new ArrayList<String>();
	static boolean isFinish = false;// 下载是否结束

	public static void main(String[] args) {
		initTaskList();// 任务列表初始化
		final DownLoadTask downLoadTask = new DownLoadTask();
		downLoadTask.start();
		// 创建用户选择下载文件的线程对象
		Thread ctrlThread = new Thread() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true) {
					// 显示下载列表
					showTaskList();
					int select;
					do {
						select = scanner.nextInt();
					} while (select < 1 || select > tasklist.size());
					if (select == tasklist.size()) {
						isFinish = true;
						System.out.println("下载结束");
					} else {
						tasks.add(tasklist.remove(select - 1));

					}
					// 通知下载线程开始下载
					synchronized (downLoadTask) {
						// 将用户选择的文件名移至tasks集合中
						downLoadTask.notify();
					}

				}

			}

			private void showTaskList() {
				for (int i = 0; i < tasklist.size(); i++) {
					System.out.println(i + 1 + "-" + tasklist.get(i));
				}
			}
		};
		ctrlThread.setDaemon(true);
		ctrlThread.start();

	}

	private static void initTaskList() {
		tasklist.add("spjj.zip");
		tasklist.add("se2.rar");
		tasklist.add("runHorse.rar");
		tasklist.add("Exam-liangWenFeng.zip");
		tasklist.add("quit");
	}

	// 用于下载(文件复制)的线程类
	static class DownLoadTask extends Thread {
		@Override
		public void run() {
			while (!isFinish) {
				// 当存放下载文件名的集合非空时，循环
				while (!tasks.isEmpty()) {
					download(tasks.remove(0));
				}
				// 使本线程对象进入等待状态
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
			super.run();
		}

		// 复制文件
		private void download(String fileName) {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			File srcFile = new File(SRC_PATH, fileName);
			if (!srcFile.exists()) {
				System.out.println("文件不存在！");
				return;
			}
			try {
				fis = new FileInputStream(srcFile);
				File destFile = new File(DEST_PATH, fileName);
				fos = new FileOutputStream(destFile);
				byte[] buffer = new byte[1024];
				int len;
				while ((len = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, len);
				}
				System.out.println(fileName + "复制完毕！");
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
