package com.eoe.basic.day02_;

import java.util.Scanner;

public class Test09 {

	/**
	 * �ŷ� ��
	 */
	public static void main(String[] args) {
		//�������ڼ��������Scanner����
		Scanner scanner=new Scanner(System.in);
		System.out.println("����:");
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("���:");
		double height=scanner.nextDouble();
		
		System.out.println("�ˣ���Һã�����"+name+
			",����"+age+"��,���"+height+
			"��,����һ��"+sex+'ʿ');
	}

}
