package com.eoe.basic.day04;

import java.util.Scanner;

public class Test17 {

	/**
	 * ��ѭ��������m��n�η���m��n��ֵ�ɼ������롣
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("m n=");
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		//m��1�η� m*=1;
		double result=1;//���������
//		int i=1;
//		result*=m;//m��1�η� result=m
//		i++;//i=2;
//		result*=m;//result=m*m;
//		i++;//i=3;
//		result*=m;//result=m*m*m
		for(int i=1;i<=n;i++){
			result*=m;
		}
		System.out.println(m+"��"+n+"�η�="+result);
	}

}
