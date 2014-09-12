package com.eoe.se1.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test003 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a[+,-,*,/]b:");
		try {
			int a=scanner.nextInt();
			char b=scanner.next().charAt(0);
			int c=scanner.nextInt();
			int result=0;
			switch(c){
			case '+':
				result=a+b;
				break;
			case '-':
				result=a-b;
				break;
			case '*' :
				result=a*b;
				break;
			case '/' :
				result=a/b;
				break;
			}
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		}catch(ArithmeticException e1){
			System.out.println(e1.toString());
		}
	}
}

