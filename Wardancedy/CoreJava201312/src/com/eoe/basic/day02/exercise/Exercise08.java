package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("������������");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=Math.max(a, Math.max(b, c));
		int e=Math.min(a, Math.min(b, c));
		System.out.println("�������"+d);
		System.out.println("��С����"+e);
		System.out.println("�ڶ�����:"+((a+b+c)-(d+e)));
	}
}
