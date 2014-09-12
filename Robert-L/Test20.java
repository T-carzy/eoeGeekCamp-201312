package com.eoe.pre.oop.day03;

import java.util.Scanner;

import com.eoe.pre.oop.day03.entity.Computer;

public class Test20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a [+,-,*,/] b=");
		int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int b = scanner.nextInt();
		try {
			compute4(a, c, b);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static void compute4(int a, char c, int b)
			throws Exception {
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			if ((long) a * b > Integer.MAX_VALUE) {

				throw new Exception("超出int最大值");

			}
			System.out.println(a * b);
			break;
		case '/':
			if (b == 0) {
				throw new ArithmeticException("除零错误");
			}
			System.out.println(a / b);
			break;
		default:
			System.out.println("输入的不是四则运算符号");
		}
	}

}
