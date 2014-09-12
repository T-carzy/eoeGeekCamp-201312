package com.eoe.basic.day03;

import java.util.Scanner;

public class Test09 {
	/**
	 * 输入月份，显示该月天数。
	 * 要求；不考虑闰年2月份的情况。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("month:");
		int month=scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println(28);
		default:
			System.out.println("月份输入错误");
			break;
		}
	}
}
