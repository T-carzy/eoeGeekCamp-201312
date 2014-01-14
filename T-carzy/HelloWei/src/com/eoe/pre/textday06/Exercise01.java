package com.eoe.pre.textday06;

import java.util.Scanner;

/**
 * 用递归计算∑n
 */
public class Exercise01 {


	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("n=");
			int n=scanner.nextInt();
			System.out.println(f(n));
	}
	static int f(int n){
		if(n==1){
			return 1;
		}else{
			return n+f(n-1);
		}
	}

}
