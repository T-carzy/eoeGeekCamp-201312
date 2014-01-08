package com.eoe.pre.day06_.recursion;

import java.util.Scanner;

public class Test01 {

	/**
	 * ”√µ›πÈÀ„∑®º∆À„n£°
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=fact(n);
		System.out.println("n!="+result);
	}

	private static double fact(int n) {
		if(n==1){
			return 1;
		}
		double result=n*fact(n-1);//n!=n*(n-1)!
		return result;
	}
}
