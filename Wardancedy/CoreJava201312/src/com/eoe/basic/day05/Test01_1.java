package com.eoe.basic.day05;

import java.util.Scanner;

public class Test01_1 {
	/**
	 * 打印以下n行n列的字符图形，n由键盘输入
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		//以下循环打印一行*
		for(int j=1;j<=n;j++){
			System.out.print("*");
		}
		System.out.println();
		//以下循环打印一行*
		for(int j=1;j<=n;j++){
			System.out.print("*");
		}
		System.out.println();
		//以下循环打印一行*
		for(int j=1;j<=n;j++){
			System.out.print("*");
		}
		System.out.println();
		//以下循环打印一行*
		for(int j=1;j<=n;j++){
			System.out.print("*");
		}
		System.out.println();
		//以下循环打印一行*
		for(int j=1;j<=n;j++){
			System.out.print("*");
		}
		System.out.println();
										
	}

}
