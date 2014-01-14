package com.eoe.se1.day01;

import java.util.Scanner;

import javax.activity.ActivityRequiredException;

public class Test004 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a [+,-,*,/] b=");
		int a=scanner.nextInt();
		char c=scanner.next().charAt(0);
		int b=scanner.nextInt();
		try {
			compute4(a,c,b);
		} catch (OutOfIntMaxValueException e) {
			System.out.println(e.toString());
			//e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

	}

	private static void compute4(int a, char c,int b ) throws OutOfIntMaxValueException {
		switch(c){
		case '+' :
			System.out.println(a+b);
			break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			if(1.0*a*b>Integer.MAX_VALUE){
				throw new OutOfIntMaxValueException("����int���ֵ");
			}
			System.out.println(a*b);
			break;
		case '/' :
			if(b==0){
				throw new ArithmeticException("�����쳣");
			}
			System.out.println(a/b);
			break;
		}
	}
	static class OutOfIntMaxValueException extends Exception{
		public OutOfIntMaxValueException(String message) {
			super(message);
		}
	}
	
}
