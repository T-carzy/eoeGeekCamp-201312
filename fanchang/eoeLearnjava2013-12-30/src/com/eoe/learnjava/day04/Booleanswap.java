package com.eoe.learnjava.day04;

import java.util.Scanner;

public class Booleanswap {

	/**
	 * ʵ��������������ֵ�Ļ���
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ���߼�ֵ��true��false��:");
		boolean a = scanner.nextBoolean();
		System.out.println("����ڶ����߼�ֵ��true��false��:");
		boolean b = scanner.nextBoolean();
		System.out.println("a="+a+"\tb="+b);
		a = a!=b?!(b=a):a;
		System.out.println("a="+a+"\tb="+b);
	}

}
