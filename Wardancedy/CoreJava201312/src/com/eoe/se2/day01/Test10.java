package com.eoe.se2.day01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		final Thread zhangFei=new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("z...z...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("˭�Ѱ���������");
						break;
					}
				}
			}
		};
		zhangFei.start();
		new Thread(){
			public void run() {
				System.out.println("��������");
				new Scanner(System.in).next();
				zhangFei.interrupt();
			};
		}.start();
	}
}
