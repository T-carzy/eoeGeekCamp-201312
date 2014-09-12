package com.eoe.se2.day01;

import java.util.Random;

public class Test08 {
	static int[] a = new int[30];
	static int index;

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (index < 10) {
					if (a[index] > 0) {
						System.out.println(Thread.currentThread().getName()
								+ ":" + a[index] + ":" + index);
						Thread.yield();// ��CPU����Ȩ
					}
				}
			}
		};
		t1.start();
		final Random random = new Random();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					if (index < a.length) {
						a[index] = random.nextInt(100);
						System.out.println(Thread.currentThread().getName()
								+ ":" + a[index] + ":" + index);
						yield();
						index++;
					}else{
						System.out.println("�±���Խ��");
					}
				}
			}
		};
		// ��t2����Ϊ��̨�ػ��߳�
		t2.setDaemon(true);
		t2.start();
	}
}
