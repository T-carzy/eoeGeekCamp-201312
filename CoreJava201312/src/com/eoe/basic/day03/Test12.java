package com.eoe.basic.day03;

import java.util.Scanner;

public class Test12 {
	/**
	 *键盘输入一个5分制分数，用与运算计算并显示该数是否为5分制分数。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制的分数");
		int score=scanner.nextInt();
		boolean isScore=score>=0 && score<=5;
		System.out.println("5分制分数："+isScore);
	}
}
