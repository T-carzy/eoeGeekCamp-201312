package se2.day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test06 {
	public static void main(String[] args) {
		final ThreadPoolExecutor pools = (ThreadPoolExecutor) Executors
				.newCachedThreadPool();
		TalkTask talk = new TalkTask();
		ScanVirusTask scanVirus = new ScanVirusTask();
		pools.execute(talk);
		pools.execute(scanVirus);
		pools.execute(new DownloadTask());
		pools.execute(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while (true) {
					try {
						Thread.sleep(1000);
						i++;
						System.out.println("������:" + pools.getTaskCount());
						System.out.println("��߳�����:" + pools.getActiveCount());
						System.out.println("�̳߳��е��߳�����:" + pools.getPoolSize());
						System.out.println("ִ����ϵ��߳���:"
								+ pools.getCompletedTaskCount());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	}

	static class TalkTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("��ͻ�����");
				try {
					Thread.sleep(1000 * 10);
					System.out.println("������ͻ�������");
					break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	static class DownloadTask implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(100);
					System.out.println("�����ļ�...");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�����ļ�����");

		}
	}

	static class ScanVirusTask implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
