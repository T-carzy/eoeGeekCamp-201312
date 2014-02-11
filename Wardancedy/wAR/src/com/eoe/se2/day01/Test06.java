package com.eoe.se2.day01;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		final Thread zhugeliang = new Thread() {
			public void run() {
				while (true) {
					System.out.println("我是个直男男男");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("我不是个直男男男男");
						e.printStackTrace();
						break;
					}

				}

			}
		};
		zhugeliang.start();
		new Thread() {
			public void run() {
				System.out.println("输入");
				new Scanner(System.in).next();
				zhugeliang.interrupt();
			};
		}.start();
	}

}
