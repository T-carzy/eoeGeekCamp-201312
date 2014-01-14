package com.eoe.se1.day01;

public class Test10 {

	public static void main(String[] args) {
		//System.out.println("main()");
		method1();
		try {
			method2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("method2()"+e.toString());
		}finally{
			System.out.println("无论异常是否发生，俺都会将显示");
		}
	}
	private static void method1() {
		method2();
		System.out.println("method1()");

	}
	private static void method2() {
		int[] a=new int[2];
		System.out.println(a[2]);
		System.out.println("method2()");
	}
}
