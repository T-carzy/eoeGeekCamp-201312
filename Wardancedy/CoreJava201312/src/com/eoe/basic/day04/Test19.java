package com.eoe.basic.day04;

import java.util.Scanner;

public class Test19 {

	/**
	 * ��ѭ�������㦲n����1+2+3+��+5n��n��ֵ�ɼ������롣
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		System.out.println("��"+n+"="+result);
	}

}
