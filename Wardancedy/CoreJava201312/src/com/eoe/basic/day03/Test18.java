package com.eoe.basic.day03;

import java.util.Scanner;

public class Test18 {
	/**
	 * ��������java��android��oracle���Ʒ������ҳ�������߷֡�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("java android oracle:");
		int java=scanner.nextInt();
		int android=scanner.nextInt();
		int oracle=scanner.nextInt();
		if(java>=android && java>=oracle){
			System.out.println("��߷�"+java);
		}else if(android>=oracle){
			System.out.println("��߷�"+android);
		}else{
			System.out.println("��߷�"+oracle);
		}
	}
}
