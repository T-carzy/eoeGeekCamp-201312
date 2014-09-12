package com.eoe.se1.day01;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws OutOfIntMaxValueException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a [+,-,*,/] b=");
		int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int b = scanner.nextInt();
		try {
			compute4(a, b, c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

	private static void compute4(int a, int b, char c) throws OutOfIntMaxValueException {
		// TODO Auto-generated method stub
		switch (c) {
		case '+':
			System.out.println(a + b);

			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			if (1l * a * b > Integer.MAX_VALUE) {
				throw new OutOfIntMaxValueException("超过int最大值");
			}
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
		default:
			System.out.println("输入的不是四则运算符");
		}
	}

	static class OutOfIntMaxValueException extends Exception {
		public OutOfIntMaxValueException(String message) {
			super(message);
		}

	}
}
