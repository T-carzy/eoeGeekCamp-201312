package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test02 {

	/**
	 *  *
		**
		***
		****
		*****
	 */
	public static void main(String[] args) {
//		int i=1;
//		//打印一个*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=2
//		//打印两个*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		//打印三个*
//		i++;//i=3
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=4
//		//打印四个*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=5
//		//打印五个*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			//打印一行*
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
