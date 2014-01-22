package com.eoe.sel2.day001;

public class Test01 {
	public static void main(String[] args) {
		MyThread myThread=new MyThread("¸ßÉº");
		myThread.start();
		for(int i=0;i<=30;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	static class MyThread extends Thread{
		public MyThread(String name) {
			 this.setName(name);
		}
		@Override
		public void run() {
			for (int i = 0; i <=20; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
