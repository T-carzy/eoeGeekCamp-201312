package se2.day06;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * shutDownNow的使用.
 */
public class Test04 {
	public static void main(String[] args) {
		// 创建缓存的线程池
		ExecutorService pools = Executors.newCachedThreadPool();
		pools.execute(new TalkTask());
		pools.execute(new DownloadTask());
		pools.execute(new ScanVirusTask());
		new Scanner(System.in).next();
		pools.shutdownNow();
	}

	static class TalkTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("聊天。。。");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("聊天被终止");
					break;
				}
			}
		}

	}

	static class DownloadTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("执行下载任务、、、");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("下载被终止");
					break;
				}
			}
		}
	}

	static class ScanVirusTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("扫描病毒、、、");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("扫描病毒被终止");
					break;
				}

			}
		};

	}
}
