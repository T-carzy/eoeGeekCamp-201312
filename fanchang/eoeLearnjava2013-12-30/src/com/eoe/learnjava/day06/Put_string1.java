package com.eoe.learnjava.day06;

import java.util.Scanner;

public class Put_string1 {

	/**
	 * ����1-9���ַ���,����12345,��ӡ�����ַ�ͼ��
	 * 12345
	 * 2345
	 * 345
	 * 45
	 * 5
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����1-9���ַ���,����12345:");
		String a = scanner.next();
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.substring(i));
		}
		
	}

}
