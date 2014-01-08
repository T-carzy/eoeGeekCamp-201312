package com.eoe.basic.day06.exercise;

import java.util.Scanner;

/**
 * ”√µ›πÈº∆À„°∆n
 */
public class Exercise01 {
	
	public static void main(String[] args) {
		System.out.println("n=");
		int n=new Scanner(System.in).nextInt();
		System.out.println(f(n));
	}
	static int f(int n){
		if(n==1){
			return 1;
		}
		return n+f(n-1);
	}
}
