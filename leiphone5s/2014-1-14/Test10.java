package com.eoe.oop.se1.day01;

public class Test10 {
	public static void main(String[] args) {
		try {
			divide();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("������˼������������");
		}
	}

	static void divide() {
		System.out.println(10 / 0);
	}
}
