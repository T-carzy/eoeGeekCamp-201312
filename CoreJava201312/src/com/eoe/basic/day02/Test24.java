package com.eoe.basic.day02;

import java.util.Scanner;

public class Test24 {
	/**
	 * ͨ������̨��������������ֵ��Ȼ�󽻻�����������ֵ����ӡ������ǰ��
	 * ����������������ֵ��
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("a=");
		int a=scanner.nextInt();
		System.out.print("b=");
		int b=scanner.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"\tb="+b);
	}
}
