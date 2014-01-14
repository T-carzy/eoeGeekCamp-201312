package com.eoe.sel.day01;

public class __ArithmeticException {


	public static void main(String[] args) {
		try {
			divide();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	static void divide(){
		System.out.println(10/0);
	}

}
