package com.eoe.basic.day02;

import java.util.Scanner;

public class Test22 {
	/**
	 * ʾ����ͨ������̨����һ���˵��������Ա����䡢��ߺ��Ը�
	 * Ȼ���ø��˺ʹ�������ҽ��ܡ�
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("��ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�Ը�");
		String type=scanner.next();
		System.out.print("�ˣ���Һã�����"+name);
		System.out.print("������"+age+"��");
		System.out.print("������һ��"+type+"��"+sex+"��");
	}
}
