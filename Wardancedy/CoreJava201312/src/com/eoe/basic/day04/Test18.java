package com.eoe.basic.day04;

import java.util.Scanner;

public class Test18 {

	/**
	 * ��ѭ��������n!����1*2*3*��*n��n��ֵ�ɼ������롣
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=1;//���������
//		int i=1;
//		result*=i;//result=1;
//		i++;//i=2
//		result*=i;//result=1*2
//		i++;//i=3
//		result*=i;//reuslt=1*2*3
//		i++;//i=4;
//		result*=i;//reuslt=1*2*3*4;
		for(int i=1; i<=n ;i++){
			result*=i;
		}
		System.out.println(n+"��="+result);
	}

}
