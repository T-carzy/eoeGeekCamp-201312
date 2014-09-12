package com.eoe.sel2.day001;

public class Test08 {
	public static void main(String[] args) throws InterruptedException {
		Thread zhangfei=new Thread("张飞"){
			@Override
			public void run() {
				System.out.println(getName()+"睡觉了，呼噜。。");
				try {
					Thread.sleep(1000*70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("谁把我吵醒了？");
				}
			};
		};
		zhangfei.start();
		Thread.sleep(1000*2);
		zhangfei.interrupt();
	}
}
