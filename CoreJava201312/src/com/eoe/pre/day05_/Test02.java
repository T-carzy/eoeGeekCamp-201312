package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test02 {

	/**
	 *  *
		**
		***
		****
		*****
	 */
	public static void main(String[] args) {
//		int i=1;
//		//��ӡһ��*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=2
//		//��ӡ����*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		//��ӡ����*
//		i++;//i=3
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=4
//		//��ӡ�ĸ�*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;//i=5
//		//��ӡ���*
//		for(int j=1;j<=i;j++){
//			System.out.print("*");
//		}
//		System.out.println();
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			//��ӡһ��*
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
