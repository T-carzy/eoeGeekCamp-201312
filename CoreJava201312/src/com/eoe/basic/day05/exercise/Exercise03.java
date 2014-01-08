package com.eoe.basic.day05.exercise;

import java.util.Scanner;

/**
 * 不用判断着，输入月份，显示天数，考虑闰年2月分的情况。
 */
public class Exercise03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("year month=");
		int year=scanner.nextInt();
		int month=scanner.nextInt();
		boolean isLeapYear=year%400==0 || year%4==0&&year%100!=0;
		int[] days={29,31,28,31,30,31,30,31,31,30,31,30,31};
		month=month==2&&isLeapYear?0:month;
		System.out.println(days[month]);
	}
}
