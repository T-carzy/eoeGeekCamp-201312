package com.eoe.learnjava.day04;

import java.util.Scanner;

public class Arithmetic {

	/**��������
	 * ��������һ��������������һ���ַ������ַ���+��-��*��/��%�е�����һ��
	 * �ַ���������һ������������������������м���
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a [+��-��*��/��%] b");
		int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int b = scanner.nextInt();
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '%':
			System.out.println(a % b);
			break;
		default :
			System.out.println("������󣡣�");
			break;
		}
 	}

}
