package com.eoe.learnjava.day05;

import java.util.Scanner;

public class Summation {

	/**
	 * ��������n,����1+2+3+....+n�ĺ�
	 * @param args
	 */
	public static void main(String[] args) {
		double result=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����n,����1+2+3+....+n�ĺ�:");
		int n = scanner.nextInt();
		for (int i = 1;i <=n;i++){
			result+=i;
		}
		System.out.println(result);

	}

}
