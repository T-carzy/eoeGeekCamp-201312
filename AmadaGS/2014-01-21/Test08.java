package com.eoe.se2.day01;

public class Test08 {
	public static void main(String[] args) {
		RunnableImpl target=new RunnableImpl ();
		Thread zhangsan=new Thread(target, "ÕÅÈı");
		Thread wngfei=new Thread(target, "Íõ·Æ");
		Thread liuyifei =new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		});
		zhangsan.start();
		wngfei.start();
		liuyifei.start();
		
	}
   static class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
