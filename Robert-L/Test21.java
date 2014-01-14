package com.eoe.pre.oop.day03;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a [+,-,*,/] b");
		int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int b = scanner.nextInt();
		try {
			computer(a, c, b);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (OutOfIntMaxValueException e) {
			System.out.println(e.toString());

		} catch (DivideByZero e) {
			System.out.println(e.toString());
		}

	}

	private static void computer(int a, char c, int b)
			throws OutOfIntMaxValueException,DivideByZero {
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
			if (b == 0) {
				throw new DivideByZero("除零错误");
			}
			System.out.println(a / b);
			break;
		default:
			System.out.println("输入的不是四则运算符号");
		}
	}

	static class OutOfIntMaxValueException extends Exception {
		public OutOfIntMaxValueException(String message) {
			super(message);
		}
	}

	static class DivideByZero extends Exception {
		public DivideByZero(String message) {
			super(message);
		}

	}

}
