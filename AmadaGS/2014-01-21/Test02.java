package com.eoe.se2.day01;

public class Test02 {
	public static void main(String[] args) {
		MyThread t=new MyThread("¸ßÉº");
		t.start();
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName()+"zZ...."+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static class MyThread extends Thread {
		public MyThread() {
			// TODO Auto-generated constructor stub
		}

		public MyThread(String name) {
			this.setName(name);
		}

		@Override
		public void run() {
			for (int i = 0; i < 40; i++) {
				System.out.println(this.getName()+"z.zZ..");
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