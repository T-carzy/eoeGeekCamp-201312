package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise02 {

	/**
	 * ��д���㻪��ת��Ϊ�����¶ȵĳ���
	 * ��ʽ�� �����¶�ֵ=�������¶�ֵ-32����5��9
   	      Ҫ��
   	      	1��������ʩ�¶��ɼ������롣
   	      	2������С�����1λ
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���뻪���¶�:");
		double h=scanner.nextDouble();
		double c=Math.round((h-32)*5/9*10)/10.0;
		System.out.println("�����¶�="+c);
	}

}