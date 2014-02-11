package com.eoe.se2.day01;

public class Test09 {
	public static void main(String[] args) throws InterruptedException {
		Thread zhangFei=new Thread(){
			@Override
			public void run() {
				try {
					Thread.sleep(1000*10);
					System.out.println("°³Ë¯ÐÑÀ²!");
				} catch (InterruptedException e) {
					System.out.println("Ë­°Ñ°³³³ÐÑÀ²£¿");
				}
			}
		};
		zhangFei.start();
		Thread.sleep(2000);
		zhangFei.interrupt();//»½ÐÑÏß³Ì
	}
}
