package com.eoe.sel02.day01;

public class Teat05 {
	public static void main(String[] args) {
			MyThread zhangFei=new MyThread("张飞");
			MyThread wangFei=new MyThread("王菲");
			zhangFei.start();
			wangFei.start();
}
	static class MyThread extends Thread{
		public MyThread(String name){
			setName(name);
		}
		@Override
		public void run() {
			for (int i = 1; i <=10; i++) {
				System.out.println(this.getName());
				yield();
			}
		}
	}
}
