package com.eoe.basic.day03;

import java.util.Scanner;

public class Test12 {
	/**
	 *��������һ��5���Ʒ���������������㲢��ʾ�����Ƿ�Ϊ5���Ʒ�����
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ƶķ���");
		int score=scanner.nextInt();
		boolean isScore=score>=0 && score<=5;
		System.out.println("5���Ʒ�����"+isScore);
	}
}
