package com.eoe.basic.day03;

import java.util.Scanner;

public class Test11 {
	/**
	 * 键盘输入分数，显示该分数是否及格。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入分数:");
		int score=scanner.nextInt();
		boolean isPass=score>=60;
		System.out.println("及格:"+isPass);
	}
}
