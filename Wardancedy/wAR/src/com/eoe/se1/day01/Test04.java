package com.eoe.se1.day01;

import java.util.Scanner;

public class Test04 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("a    [+,-,*,/]    b");
	int a=scanner.nextInt();
	char c=scanner.next().charAt(0);
	int b=scanner.nextInt();
	try {
		compute4(a,b,c);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.toString());
	}
}

private static void compute4(int a, int b, char c)throws ArithmeticException {
	// TODO Auto-generated method stub
	switch (c) {
	case '+':
		System.out.println(a+b);
		break;
	case '-':
	System.out.println(a-b);
		break;
	case '*':
		System.out.println(a*b);
		break;
	case '/':
		if (b==0) {
			throw new ArithmeticException("除零错误");
			
		}
		System.out.println(a/b);
		break;
		default:
			System.out.println("输入的不是四则运算符号");
	}
}
}
