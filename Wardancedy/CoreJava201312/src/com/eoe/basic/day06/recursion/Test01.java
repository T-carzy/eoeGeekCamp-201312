package com.eoe.basic.day06.recursion;

public class Test01 {
	public static void main(String[] args) {
		double result=fact(4);
		System.out.println("4!="+result);
	}
	/**
	 * fact()递归的方式求n!
	 * @param n
	 * @return
	 */
	static double fact(int n){
		if(n==1){
			return 1;
		}
		double result=n*fact(n-1);
		return result;
	}
}
