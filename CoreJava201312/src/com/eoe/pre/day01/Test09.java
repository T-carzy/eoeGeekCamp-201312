package com.eoe.pre.day01;

import java.util.Scanner;

public class Test09 {

	/**
	 * switch()���������
	 * ֻ�ܴ���int��char���͵ı����Ķ��ֿ���ֵ.jdk1.6
	 * jdk1.7:switch�ܴ���String���͡�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ƶķ���:");
		int score=scanner.nextInt();
		switch (score) {
		case 5:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("�������!");
			break;
		}
	}
	//siwtch���������
}
