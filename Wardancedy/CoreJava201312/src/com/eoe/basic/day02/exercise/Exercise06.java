package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise06 {
	/**
	 * ��д���򣬼�����������int���͵�������ӡ���������Ƿ���ȡ�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a b=");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("a����b:"+((a^b)==0));
		
	}
	
}
