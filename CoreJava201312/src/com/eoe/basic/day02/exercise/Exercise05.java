package com.eoe.basic.day02.exercise;

import java.util.Scanner;

public class Exercise05 {

	/**
	 * ��д���򣬼�������һ��int���͵�������������Ĳ��롣
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		System.out.println("n�Ĳ���:"+(~n+1));
	}

}
