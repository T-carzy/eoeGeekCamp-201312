package com.eoe.se1.day012;

public class Exercise03 {

	public Exercise03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			method1();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
			System.out.println("main");
		}

	

	private static void method1() {
		method2();{
			System.out.println("method1");
		}
		
	}

	private static void method2() {
		int[] a=new int[2];
		System.out.println(a[2]);
		System.out.println("俺不会被执行到");
	}

}
