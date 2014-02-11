package se2.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test05 {
	static final String SRC_PATH = "E:/java_test/src/";
	static final String DEST_PATH = "E:/java_test/dest/";
	static ArrayList<String> taskList = new ArrayList<String>();
	static ExecutorService pools;

	public static void main(String[] args) {
		initTaskList();// 任务列表初始化
		// 创建单线程池
		pools = Executors.newSingleThreadExecutor();
		// 用户选择复制文件的线程
		new Thread() {
			@Override
			public void run() {
				while (true) {
					showTaskList();// 显示复制的文本列表
					Scanner scanner = new Scanner(System.in);
					int select = scanner.nextInt();
					if (select == taskList.size()) {
						System.out.println("文件复制结束！");
						pools.shutdown();
						break;
					}
					String fileName = taskList.remove(select - 1);
					pools.execute(new CopyTask(fileName));
				}
			};
		}.start();

	}

	// 定义复制的任务类
	static class CopyTask implements Runnable {
		String fileName;

		public CopyTask(String fileName) {
			super();
			this.fileName = fileName;
		}

		@Override
		public void run() {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(SRC_PATH + fileName);
				fos = new FileOutputStream(DEST_PATH + fileName);
				int len;
				byte[] buffer = new byte[1024 * 10];
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
					if (fis != null) {
						fis.close();
					}
					if (fos != null) {
						fos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	static void initTaskList() {
		taskList.add("Exam-liangWenFeng.zip");
		taskList.add("runHorse.rar");
		taskList.add("se2.rar");
		taskList.add("spjj.zip");
		taskList.add("quit");
	}

	// 显示复制的文本列表
	private static void showTaskList() {
		for (int i = 0; i < taskList.size(); i++) {
			System.out.println(i + 1 + "-" + taskList.get(i));
		}
	}
}
