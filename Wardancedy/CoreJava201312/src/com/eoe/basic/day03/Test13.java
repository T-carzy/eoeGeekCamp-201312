package com.eoe.basic.day03;

import java.util.Scanner;

public class Test13 {
	/**
	 *  ��������һ��5���Ʒ������û�������㲢��ʾ�����Ƿ�Ϊ5���Ƶķ�����
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ƶķ���");
		int score=scanner.nextInt();
		boolean isnotScore=score<0 || score>5;
		System.out.println("����5���Ʒ�����"+isnotScore);		
	}
}
