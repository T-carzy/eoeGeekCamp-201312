package com.eoe.se1.day01.entity;

public class Test02 {
public static void main(String[] args) {
	try {
		method1();
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println(e.toString());
	}
	System.out.println("main");
}

private static void method1() {
	try {
		method2();
	} catch (ArithmeticException e) {
		System.out.println(e.toString());
	}
	System.out.println("method1");
}

private static void method2() {
	// TODO Auto-generated method stub
	int[] a=new int[2];
	System.out.println(a[2]);
	System.out.println("我不会被执行到");
}

}
