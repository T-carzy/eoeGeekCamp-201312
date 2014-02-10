package se2.day05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test05 {
	public static void main(String[] args) {

		// ������������̳߳�
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
				System.out.println("����...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("���챻��ֹ");
					break;
				}
			}
		}
	}

	static class DownloadTask implements Runnable {
		@Override
		public void run() {
			while (true) {
				System.out.println("ִ����������...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("���ر���ֹ");
					break;
				}
			}
		}
	}

	static class ScanVirusTask implements Runnable {
		public void run() {
			while (true) {
				System.out.println("ɨ�財��...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("ɨ�財������ֹ");
					break;
				}
			}
		};
	}

}
