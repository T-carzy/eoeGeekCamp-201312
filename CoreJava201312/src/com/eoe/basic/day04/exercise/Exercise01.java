package com.eoe.basic.day04.exercise;

import java.util.Scanner;

public class Exercise01 {

	/**
	 * 2�� ����1~9���ַ���������12345,��ӡ�����ַ�ͼ�Σ�
	 * 12345
	 *  1234
	 *   123
	 *    12
	 *     1
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����1-9���ַ�:");
		String s=scanner.next();
		String space="";
		int len=s.length();//�����ַ�������
		for(int i=1;i<=len;i++){
			System.out.println(space+s.substring(0, len-i+1));
			space+=" ";
		}
	}

}
