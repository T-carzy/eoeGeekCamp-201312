package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise07 {
/**
 * 键盘输入一个整数，要求只输入四位数。然后将该数反向打印。
	例如：输入5327,显示7235
 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a=");
		int a=scanner.nextInt();
		int g=a%10;
		int s=a/10%10;
		int b=a/100%10;
		int q=a/1000;
		System.out.println(""+g+s+b+q);
	}
}
