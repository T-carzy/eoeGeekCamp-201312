package com.eoe.learnjava.day06;

import java.util.Scanner;

public class Print_test01 {

	/**
	 * ��ӡһ�µ�n��n�е��ַ�ͼ��,n�ɼ���������
	 * Ҫ��:һ������һ��*��
	 *    *****
	 *    *****
	 *    *****
	 *    *****
	 *    *****
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n:");
		int n = scanner.nextInt();
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();	
		}

	}

}
