package com.eoe.basic.day03;

import java.util.Scanner;

public class Test11 {
	/**
	 * ���������������ʾ�÷����Ƿ񼰸�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������:");
		int score=scanner.nextInt();
		boolean isPass=score>=60;
		System.out.println("����:"+isPass);
	}
}
