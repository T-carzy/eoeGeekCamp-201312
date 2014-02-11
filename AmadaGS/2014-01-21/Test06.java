package com.eoe.se2.day01;

public class Test06 {
	public static void main(String[] args) {
		new Thread("住户张三"){
			@Override
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println(this.getName()+":你谁呀？");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
		//创建第二个线程对象并立即执行
		new Thread("工人张飞"){
			public void run() {
				for (int i = 0; i <=10; i++) {
					System.out.println(getName()+":修水管的");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
	}
	}
