package com.eoe.pre.day01;

import java.util.Scanner;

public class Test11 {

	/**
	 * true,false:�߼�ֵ������ֵ
	 * boolean �߼�����
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���뿼�Է���:");
		int score=scanner.nextInt();
		boolean pass=score>=60;
		System.out.println("�ɼ�����:"+(score>=60));
	}

}
