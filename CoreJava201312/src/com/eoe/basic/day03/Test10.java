package com.eoe.basic.day03;

import java.util.Scanner;

public class Test10 {
	/*
	 * ��������һ��������������һ���ַ������ַ���+��-��*��/�ĸ��ַ��е�
	 * ����һ����������һ�������������������������������������������Ӧ
	 * �ļ��㡣
	 * ���磺����5 * 4,�������ʾ5+4�Ľ��9.���������������������ַ�������ʾ
	 * ������������
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("a [+,-,*,/,%] b=");
		int a=input.nextInt();
		char c=input.next().charAt(0);
		int b=input.nextInt();
		System.out.print(""+a+c+b+"=");
		switch(c){
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("���ܽ����������");	
		}
	}
}
