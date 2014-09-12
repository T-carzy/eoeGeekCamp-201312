package com.eoe.se1.day012;

import java.util.Scanner;

public class Exercise04 {

	public Exercise04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a[+,-,*,/]b=");
		int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int b = scanner.nextInt();
		try {
			compute4(a, c, b);
		} catch (DivideByZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OutOfIntMaxValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void compute4(int a, char c, int b) throws DivideByZero,
			OutOfIntMaxValueException {
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			if ((double) a * b > Integer.MAX_VALUE) {

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
			System.out.println("输入的不是四则运算");
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
