package com.eoe.sel02.day01;

public class Test09 {
	public static void main(String[] args) throws InterruptedException {
		Thread zhangFei=new Thread(){
			@Override
			public void run() {
				try {
					Thread.sleep(1000*10);
					System.out.println("起床了");
				} catch (InterruptedException e) {
					System.out.println("好的");
				}
			}
		};
		zhangFei.start();
		Thread.sleep(2000);
		zhangFei.interrupt();
}
}
