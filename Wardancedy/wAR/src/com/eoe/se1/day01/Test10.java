package com.eoe.se1.day01;

public class Test10 {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		
		try{
			int c=a/b;
			System.out.println(c);
			int[] d=new int[2];
			System.out.println(d[2]);
			System.out.println("俺不会被执行到");
		}catch(ArithmeticException e){
			System.out.println("除零错误"); 
		}finally{
			System.out.println("无论是否发生异常，俺都会把这执行到");
		}
	}
}
