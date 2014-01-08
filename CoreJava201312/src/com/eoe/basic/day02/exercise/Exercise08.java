package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入三个数：");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=Math.max(a, Math.max(b, c));
		int e=Math.min(a, Math.min(b, c));
		System.out.println("最大数："+d);
		System.out.println("最小数："+e);
		System.out.println("第二大数:"+((a+b+c)-(d+e)));
	}
}
