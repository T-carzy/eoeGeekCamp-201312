package com.eoe.se1.day01;

public class Test10 {
	public static void main(String[] args) {
		try{
			divide();
		}catch(ArithmeticException a){
			a.printStackTrace();
		}
	}
	static void divide(){
		System.out.println(10/0);
	}
}
