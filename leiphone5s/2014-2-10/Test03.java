package se2.day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test03 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newCachedThreadPool();
		pools.execute(new DownloadTask("�ļ�1"));
		pools.execute(new DownloadTask("�ļ�2"));
		pools.execute(new DownloadTask("�ļ�3"));
		pools.shutdown();
	}

	static class DownloadTask implements Runnable {
		String name;

		public DownloadTask(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name + "������..."+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
