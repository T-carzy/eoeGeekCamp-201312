package com.eoe.basic.day03;

import java.util.Scanner;

public class Test09 {
	/**
	 * �����·ݣ���ʾ����������
	 * Ҫ�󣻲���������2�·ݵ������
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
			System.out.println("�·��������");
			break;
		}
	}
}