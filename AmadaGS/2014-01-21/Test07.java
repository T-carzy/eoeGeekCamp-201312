package com.eoe.se2.day01;

public class Test07 {
	public static void main(String[] args) {
		new Thread(new RunnableImpl()).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println("new Runnable:"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
			
		}).start();
	}
	static class RunnableImpl implements Runnable{

		@Override
		public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("RunnableImpl:"+i);
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
