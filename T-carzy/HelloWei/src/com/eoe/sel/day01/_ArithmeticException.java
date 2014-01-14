package com.eoe.sel.day01;

import java.util.Scanner;

public class _ArithmeticException {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a b=");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		try {
			divide(a, b);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	static void divide(int a,int b)throws ArithmeticException,
	ArrayIndexOutOfBoundsException{
		if(b==0){
			throw new ArithmeticException("除零错误");
		}
		int c=a/b;
		System.out.println(c);
	}

}
