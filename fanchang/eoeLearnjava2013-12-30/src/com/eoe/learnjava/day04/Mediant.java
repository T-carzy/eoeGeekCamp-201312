package com.eoe.learnjava.day04;

import java.util.Scanner;

public class Mediant {

	/**
	 * �������������ҵ��м�ֵ
	 * �����ж����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������������a b c :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max=Math.max(a, Math.max(b, c));
		int min=Math.min(a, Math.min(b, c));
		System.out.println("���ֵ�ǣ�"+max+"  �м�ֵ�ǣ�"+(a+b+c-max-min)+"  ��Сֵ�ǣ�"+min);
        /*�� a+b+c ��ȥ���ֵ����Сֵ�Ľ�� �����м�ֵ*/
	}

}
