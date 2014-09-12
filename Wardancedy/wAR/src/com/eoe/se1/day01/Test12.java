package com.eoe.se1.day01;

public class Test12 {
public static void main(String[] args) {
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("谁把我弄醒了");
	}
	System.out.println("10秒以后");
}
}
