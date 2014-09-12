package com.eoe.basic.day03;

import java.util.Scanner;
/**
 * 用三目运算判断奇偶数。
 */
public class Test21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个整数：");
		int i=input.nextInt();
		String message=i%2==0?"偶数":"奇数";
		System.out.println(message);
	}
}
