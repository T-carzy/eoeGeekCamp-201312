package com.eoe.basic.day03;

import java.util.Scanner;
/**
 * ����Ŀ�����ж���ż����
 */
public class Test21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("����һ��������");
		int i=input.nextInt();
		String message=i%2==0?"ż��":"����";
		System.out.println(message);
	}
}
