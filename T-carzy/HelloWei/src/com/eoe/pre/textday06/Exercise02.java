package com.eoe.pre.textday06;

import java.util.Scanner;

//用递归计算m的 n次方
public class Exercise02 {

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("m,n=");
			int m=scanner.nextInt();
			int n=scanner.nextInt();
			System.out.println(f(m,n));
	}
	static int f(int m,int n){
		if(n==0){
			return 1;
		}else{
			return m*f(m,n-1);
		}
	}

}
