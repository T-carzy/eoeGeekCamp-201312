package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise01 {

	/**
	 * ��д���򣬼���2^n��Ҫ��
		(1)n�ɼ������롣
		(2)����ʹ��Math.pow()
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		System.out.println("2^n="+(1<<n));
	}

}
