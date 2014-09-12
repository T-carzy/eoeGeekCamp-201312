package com.eoe.basic.day02.exercise;

public class Exercise03 {

	/**
	 * 编写程序，用减法实现两个变量值互换
	 */
	public static void main(String[] args) {
		int a=11;
		int b=5;
		a-=b;
		b=a+b;
		a=b-a;		
	}

}
