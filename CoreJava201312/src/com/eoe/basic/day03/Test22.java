package com.eoe.basic.day03;

import java.util.Scanner;

public class Test22 {
	/**
	 * ��Ŀ���㰸����ʵ��������������ֵ����(��������������)
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������߼�ֵ(true��false");
		boolean a=scanner.nextBoolean();
		boolean b=scanner.nextBoolean();
		System.out.println("a="+a+"\tb="+b);
		a=a!=b?!(b=a):a;
		System.out.println("a="+a+"\tb="+b);
	}
}
