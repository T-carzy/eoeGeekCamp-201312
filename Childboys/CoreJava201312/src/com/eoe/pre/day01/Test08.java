package com.eoe.pre.day01;

import java.util.Scanner;

public class Test08 {

	/**
	 * ����5���Ƶķ������������ۡ� ctrl+shif+f:��ϼ�
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����5���Ƶķ���:");
		int score = scanner.nextInt();
		//true  false
		if (score == 5) {
			System.out.println("��");
		} else if (score == 4) {
			System.out.println("��");
		} else if (score == 3) {
			System.out.println("����");
		} else if (score >= 0 && score <= 2) {
			System.out.println("������");
		} else {
			System.out.println("�������!");
		}
	}

}
