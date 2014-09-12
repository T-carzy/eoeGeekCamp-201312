package com.eoe.se2.day01;

public class Test06 {
	public static void main(String[] args) {
		RunnableImp target=new RunnableImp();
		Thread zhangFie=new Thread(target, "ÕÅ·É");
		Thread wangFie=new Thread(target, "Íõ·Æ");
		Thread liuyiFie=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<50;i++){
					System.out.println(Thread.currentThread()+":"+i);
				}
			}
		}, "ÁõÒà·Æ");
		zhangFie.start();
		wangFie.start();
		liuyiFie.start();
	}
	static class RunnableImp implements Runnable{
		@Override
		public void run() {
			for(int i=1;i<50;i++){
				System.out.println(Thread.currentThread()+":"+i);
			}
		}
		
	}
}
