package com.eoe.sel.day01;

public class Test07 {

	public static void main(String[] args) {
			methold1();
			System.out.println("main");
	}

	private static void methold1() {
			try {
				mathold2();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
			System.out.println("methold1");
	}
	private static void mathold2(){
		int[] a=new int[2];
		System.out.println(a[2]);
		System.out.println("俺不会被执行");
	}

}
