package com.eoe.se1.day01;

public class Test06 {
	public static void main(String[] args) {
		try {
			divide();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	static void divide() {
		System.out.println(4 / 0);
	}
}
