package com.eoe.pre.day06_.recursion;

import java.util.Scanner;

/**
 * 用递归算法计算斐波那契列数
 * 0 1 1 2 3 5 8 13 21
 * f(n)=f(n-1)+f(n-2) 
 * @author yw
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int result=f(n);
		System.out.println("f("+n+")="+result);
	}
	//递归计算f(n)
	static int f(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int y=f(n-1)+f(n-2);
		return y;
	}
}
