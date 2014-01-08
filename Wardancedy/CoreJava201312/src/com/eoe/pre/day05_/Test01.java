package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		//打印5行星号
		for(int j=1;j<=n;j++){
			//打印一行星号
			for(int i=1;i<=n;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++){
//			System.out.print("*");
//		}
//		System.out.println();
		
	}

}
