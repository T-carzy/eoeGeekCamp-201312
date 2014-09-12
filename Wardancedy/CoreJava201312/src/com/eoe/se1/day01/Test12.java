package com.eoe.se1.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a [+,-,*,/] b=");
		try {
			int a=scanner.nextInt();
			char c=scanner.next().charAt(0);
			int b=scanner.nextInt();
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
				System.out.println(a/b);
				break;
			default:
				System.out.println("����Ĳ��������������");
			}
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
	}
}
