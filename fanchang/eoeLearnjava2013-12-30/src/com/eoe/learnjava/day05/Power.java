package com.eoe.learnjava.day05;

import java.util.Scanner;

public class Power {

	/**
	 * ��ѭ��������2��n�η�,n�ɼ�������
	 * @param args
	 */
	
	//2��n�η�
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������n:");
//		int n = scanner.nextInt();
//		int result=1;
//		for(int i=1;i<=n;i++){
//			result*=2;
//		}
//		System.out.println("2��n�η���:"+result);
//	}
	
	//m��n�η�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������m:");
		int m = scanner.nextInt();
		System.out.println("������n:");
		int n = scanner.nextInt();
		int result = 1;
		for(int i=1;i<=n;i++){
			result*=m;
		}
		System.out.println("m��n�η���:"+result);
	}
}
