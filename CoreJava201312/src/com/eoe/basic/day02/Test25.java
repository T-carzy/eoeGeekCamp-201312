package com.eoe.basic.day02;

import java.util.Scanner;

public class Test25 {
	/**
	 * ������������������ֱ�ӽ�������������ֵ����ӡ������ǰ��
	 * ����������������ֵ��
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("a=");
		int a=scanner.nextInt();
		System.out.print("b=");
		int b=scanner.nextInt();
		a=a+b;//a=a+b,b=b
		b=a-b;//a=a+b,b=a
		a=a-b;//a=b,b=a
		System.out.println("a="+a+"\tb="+b);
	}
}
