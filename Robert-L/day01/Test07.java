package com.eoe.se1.day01;

public class Test07 {
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("谁把俺弄醒了！");
		}
		System.out.println("1秒以后");

	}
}
