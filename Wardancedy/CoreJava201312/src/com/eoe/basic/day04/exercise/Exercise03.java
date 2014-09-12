package com.eoe.basic.day04.exercise;

import java.util.Scanner;

import com.eoe.tools.MyTools;

/*
 *4�����㣺1/1-1/2+1/3-1/4+...+1/(n-1)-1/n      
	��������n��ֵ������С�����2λ�� 
 */
public class Exercise03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=0;
		for(int i=1;i<=n;i+=2){
			result+=1.0/i-1.0/(i+1);
		}
		System.out.println("1/1-1/2+1/3-1/4+...+1/(n-1)-1/n="+MyTools.pround(result, 2));
	}
}
