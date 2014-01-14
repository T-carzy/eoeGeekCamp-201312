package com.eoe.pre.oop.day03;

public class Test19 {
	public static void main(String[] args) {
		try {

			method1();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a.toString());
		}
		System.out.println("main");
	}

	private static void method1() {
		method2();
		System.out.println("method1");
	}

	private static void method2() {
		int[] a = new int[2];
		System.out.println(a[2]);
		System.out.println("俺不会执行到");
	}
}
