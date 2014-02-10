package se2.day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
	public static void main(String[] args) {
		ExecutorService pools = Executors.newFixedThreadPool(3);
		pools.execute(new MyThread("张飞"));
		pools.execute(new MyThread("王菲"));
		pools.execute(new MyThread("刘亦菲"));
		pools.execute(new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("咖啡在跳舞" + i);
				}
			};

		});
	}

	static class MyThread extends Thread {
		String name;

		public MyThread(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				if ("张飞".equals(name)) {
					System.out.println(name + "射箭。。。" + i);
				} else if ("王菲".equals(name)) {
					System.out.println(name + "唱歌。。。" + i);
				} else if ("刘亦菲".equals(name)) {
					System.out.println(name + "演戏。。。" + i);
				}
			}
		}
	}
}
