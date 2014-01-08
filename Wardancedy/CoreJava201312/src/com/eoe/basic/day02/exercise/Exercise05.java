package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise05 {

	/**
	 * 编写程序，键盘输入一个int类型的数，求出该数的补码。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		System.out.println("n的补码:"+(~n+1));
	}

}
