package com.eoe.basic.day03;

import java.util.Scanner;

public class Test19 {
	/**
	 * ��������java��android��oracle���Ʒ������ҳ�������߷֡�
	 * �ⷨ2-ѡ��
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("java android oracle:");
		int java=scanner.nextInt();
		int android=scanner.nextInt();
		int oracle=scanner.nextInt();
		int max=java;
		if(max<android){
			max=android;
		}
		if(max<oracle){
			max=oracle;
		}
		System.out.println("��߷�"+max);
	}
}
