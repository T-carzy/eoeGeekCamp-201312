package com.eoe.basic.day03;

import java.util.Scanner;

public class Test08 {
	/**
	 * switch���ʾ��
	 * ���������š������С��������Ӧ�ķ���5��4��3��2
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����š������С��");
		char grade=scanner.next().charAt(0);
		switch (grade) {
		case '��':
			System.out.println(5);
			break;
		case '��':
			System.out.println(4);
			break;
		case '��':
			System.out.println(3);
			break;
		case '��':
			System.out.println(2);
		default:
			System.out.println("����ĵȼ�����");
			break;
		} //case ������
	} //main()������
}
