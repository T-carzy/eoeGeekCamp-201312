package com.eoe.basic.day04.exercise;

import java.util.Scanner;

import com.eoe.tools.MyTools;

public class Exercise02 {

	/**
	 * 3�� ��д���� ���㣺1+1/2+1/3+..+1/n��Ҫ��
      ��������n��ֵ������С�����2λ��
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=0;
		for(int i=1;i<=n;i++){
			result+=1.0/i;
		}
		System.out.println("1+1/2+1/3+..+1/n="+MyTools.pround(result, 2));
	}
	
}
