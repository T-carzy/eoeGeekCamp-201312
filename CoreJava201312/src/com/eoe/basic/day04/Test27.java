package com.eoe.basic.day04;

import java.util.Scanner;

public class Test27 {

	/**
	 * ��ӡ�ַ�ͼ��(1)
	 ����1~9���ַ���������12345,��ӡ�����ַ�ͼ�Σ�
	 	12345
	 	2345
	 	345
	 	45
	 	5

	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����ַ���:");
		String text=scanner.next();
		for(int i=0;i<text.length();i++){
			System.out.println(text.substring(i));
		}
	}

}
