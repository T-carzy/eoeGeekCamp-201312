package com.eoe.basic.day06.exercise;

import java.util.Scanner;

public class Exercise02 {
	//�õݹ����m�� n�η�
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("m,n=");
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		System.out.println(f(m,n));
	}
	static double f(int m,int n){
		if(n==0){
			return 1;
		}
		return m*f(m,n-1);
	}
}
