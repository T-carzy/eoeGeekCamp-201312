package com.eoe.se2.day01;
public class Test01 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		for (int i = 0; i <=50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
	class MyThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i <=50; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
