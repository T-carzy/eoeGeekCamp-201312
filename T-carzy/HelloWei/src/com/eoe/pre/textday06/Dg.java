package com.eoe.pre.textday06;

import java.util.Scanner;

public class Dg {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		System.out.println("Σ"+n+"="+fact(n));
		
	}
	static double fact(int n){
		if(n==1){
			return 1;
		}
		double result=n+fact(n-2);
		return result;
	}

}
