package com.eoe.basic.day05;

import java.util.Scanner;

public class Test02_2 {
	/**
	 * ��ӡ�����ַ�ͼ�Σ�n�ɼ�������
	 *     *
	 *     **
	 *     ***
	 *     ****
	 *     *****
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
//		int i=1;
//		//����ѭ����ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		i++; //i=2
//		System.out.println();
//		//����ѭ����ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++; //i=3
//		//����ѭ����ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++; //i=4
//		//����ѭ����ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++; //i=5
//		//����ѭ����ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
