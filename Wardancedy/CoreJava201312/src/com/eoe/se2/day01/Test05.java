package com.eoe.se2.day01;

public class Test05 {
	public static void main(String[] args) {
		MyThread zhangFie=new MyThread("’≈∑…");
		MyThread wangFie=new MyThread("Õı∑∆");
		zhangFie.start();
		wangFie.start();

	}
	static class MyThread extends Thread{
		public MyThread(String name) {
			setName(name);
		}
		@Override
		public void run() {
			for(int i=1;i<=10;i++){
				System.out.println(this.getName()+":"+i);
				yield();
			}
		}
	}
}
