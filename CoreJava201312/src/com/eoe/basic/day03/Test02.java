package com.eoe.basic.day03;

import java.util.Scanner;

public class Test02 {
	/**
	 * ʾ������ʾ�Զ��巽���͵����Զ���ķ���
	 */
	//���¶����徲̬����
	static String name;//����
	static char sex;//�Ա�
	static int age;//����
	static double height;//���
	static String type;//�Ը�
	public static void main(String[] args) {
		input();//��һ�ε���input()Ϊ��һ������������
		//���´����ʾ����˵���������ҽ���
		System.out.print("�ˣ���Һã�������"+name);
		System.out.print(",���꣺"+age+"��");
		System.out.print(",��ߣ�"+height+"��,");
		System.out.println("����һ��"+type+"��"+sex+"��");
		System.out.println("��ʧ������������...");
		input();//�ڶ��ε���input()Ϊ��һ������������
		//���´����ʾ����˵���������ҽ���
		System.out.print("�ˣ���Һã�������"+name);
		System.out.print(",���꣺"+age+"��");
		System.out.print(",��ߣ�"+height+"��,");
		System.out.println("����һ��"+type+"��"+sex+"��");
		System.out.println("�����������������(*^__^*)...");
	}
	//����input���������ڸ�name,sex,age,height��type��������
	static void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		name=scanner.next();
		System.out.println("�Ա�");
		sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		age=scanner.nextInt();
		System.out.println("��ߣ�");
		height=scanner.nextDouble();
		System.out.println("�Ը�");
		type=scanner.next();
	}
}
