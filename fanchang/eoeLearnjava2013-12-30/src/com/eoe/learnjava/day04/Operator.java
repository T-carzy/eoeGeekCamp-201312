package com.eoe.learnjava.day04;

import java.util.Scanner;

public class Operator {

	/**
	 * ����Ŀ�����ж���ż��
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String result = num % 2==0?"ż��":"����";
		System.out.println(result);		
	}

}
