package com.eoe.basic.day01;

import java.util.Scanner;

public class Test06 {

	/**
	 * ͨ������̨����һ���˵��������Ա����䣬��ߺ��Ը�
	 */
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("����:");
			String name=scanner.next();
			System.out.println("�Ա�:");
			char  sex=scanner.next().charAt(0);
			System.out.println("����:");
			int age=scanner.nextInt();
			System.out.println("���:");
			double height=scanner.nextDouble();
			System.out.println("�Ը�:");
			String type=scanner.next();
			System.out.println("��Һã�����"+name);
			System.out.println(",����"+age+"��,"+"���"+height);
			System.out.println(".����һ��"+type+"��"+sex+"�� --��");
					
	}

}
