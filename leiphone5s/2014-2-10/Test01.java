package se2.day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newFixedThreadPool(3);
		pools.execute(new MyThread("�ŷ�"));
		pools.execute(new MyThread("����"));
		pools.execute(new MyThread("�����"));
		pools.execute(new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					System.out.println("����������..." + i);
				}
			}
		});
		pools.shutdown();
	}

	static class MyThread extends Thread {
		String name;

		public MyThread(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				if ("�ŷ�".equals(name)) {
					System.out.println(name + "�����...");
				} else if ("����".equals(name)) {
					System.out.println(name + "�ڳ���...");
				} else if ("�����".equals(name)) {
					System.out.println(name + "����Ϸ...");
				}

			}
		}
	}
}
