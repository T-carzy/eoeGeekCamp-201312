package com.eoe.basic.day03;

import java.util.Scanner;

public class Test16 {
	/**
	 * ���������������������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������������");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if(a>b){
			System.out.println("�������"+a);
		}else{
			System.out.println("�������"+b);
		}
	}
}
