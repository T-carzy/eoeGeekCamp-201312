package com.eoe.basicLearn.day02;

import java.util.Scanner;

public class Test10 {

	/**
	 * @param argsʾ����ͨ������̨����һ���˵��������Ա����䡢��ߺ��Ը�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner a=new Scanner(System.in);
    System.out.println("����");
     String name=a.next(); 
     System.out.println("�Ա�");
     char sex=a.next().charAt(0);
     System.out.println("���䣺");
     int age=a.nextInt();
		System.out.println("��ߣ�");
		double height=a.nextDouble();
		System.out.println("�Ը�");
		String type=a.next();
		System.out.print("�ˣ���Һã�����"+name);
		System.out.print("������"+age+"��");
		System.out.print("������һ��"+type+"��"+sex+"��");
	}

}
