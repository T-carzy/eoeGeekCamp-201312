package com.eoe.se2.day01;

public class Test04 {
	public static void main(String[] args) {
		MyThread zhangFie=new MyThread("�ŷ�");
		MyThread wangFie=new MyThread("����");
		MyThread liuyiFie=new MyThread("�����");
		zhangFie.setPriority(Thread.MAX_PRIORITY);
		wangFie.setPriority(Thread.NORM_PRIORITY);
		liuyiFie.setPriority(Thread.MIN_PRIORITY);
		zhangFie.start();
		wangFie.start();
		liuyiFie.start();
	}
	static class MyThread extends Thread{
		public MyThread(String name) {
			setName(name);
		}
		@Override
		public void run() {
			for(int i=1;i<=10;i++){
				System.out.println(this.getName()+":"+i);
			}
		}
	}
}
