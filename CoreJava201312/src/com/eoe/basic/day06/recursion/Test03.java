package com.eoe.basic.day06.recursion;

public class Test03 {
	public static void main(String[] args) {
		int n=5;
		int y=f(5);
		System.out.println(y);
	}
	//f(n)=f(n-2)+n
	static int f(int n){
		if(n==1){
			return 1;
		}
		int y=n+f(n-2);
		return y;
	}
}
