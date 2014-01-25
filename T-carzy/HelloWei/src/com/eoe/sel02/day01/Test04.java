package com.eoe.sel02.day01;

public class Test04 {
	public static void main(String[] args) {
			MyThread zhangFei=new MyThread("张飞");
			MyThread wangFei=new MyThread("王菲");
			MyThread liuYiFei=new MyThread("刘亦菲");
			zhangFei.setPriority(Thread.MAX_PRIORITY);
			wangFei.setPriority(Thread.NORM_PRIORITY);
			liuYiFei.setPriority(Thread.MIN_PRIORITY);
			zhangFei.start();
			wangFei.start();
			liuYiFei.start();
}
	static class MyThread extends Thread{
		public MyThread(String name){
			setName(name);
		}
		@Override
		public void run() {
				for (int i = 1; i <=10; i++) {
					System.out.println(this.getName());
				}
		}
	}
}
