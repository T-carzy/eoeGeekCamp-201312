package com.eoe.basic.day02;

import java.util.Scanner;

public class Exercise03 {

	/**
	 * ��д���򣬲��õ������������ü���ʵ����������ֵ������
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������a=");
			int a = scanner.nextInt();
			System.out.println("������b=");
			int b = scanner.nextInt();
			a=a-b;
			b=a+b;
			a=b-a;
			System.out.println("�������a="+a+"    b="+b);

	}

}
