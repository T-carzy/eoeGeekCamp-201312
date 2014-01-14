package com.eoe.se1.day01;

public class Test002 {
	public static void main(String[] args) {
		double result=0;
		try {
			result=divide(10.0,0.0);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

	}

	static double divide(double a, double b) {
		double c=0;
		if(b==0){
			throw new ArithmeticException();
		}
		c=a/b;
		return c;
	}
}
