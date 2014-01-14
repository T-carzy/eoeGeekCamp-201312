package com.eoe.sel.day01;

public class Test08 {

	public static void main(String[] args) {
			try {
				methold1();
			
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
			}
			System.out.println("main");
	}

	private static void methold1() {
			
				mathold2();
			

		
			System.out.println("methold1");
	}
	private static void mathold2(){
		int[] a=new int[2];
		System.out.println(a[2]);
		System.out.println("俺不会被执行");
	}

}
