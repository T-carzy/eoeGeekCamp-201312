package com.eoe.basic.day03;

import java.util.Scanner;

public class Test04 {
	/**
	 * ʾ����
	 * 	  1��������η���feeling������˵ĸ��飬
	 * 	  2����main�����е���feeling()
	 */
	//���¶����徲̬����
	static String name;//����
	static char sex;//�Ա�
	static int age;//����
	static double height;//���
	static String type;//�Ը�
	public static void main(String[] args) {
		input();//��һ�ε���input()Ϊ��һ������������
		say();//��һ�ε���say()�����ҽ���
		feeling("��ʧ������","����...");
		input();//�ڶ��ε���input()Ϊ��һ������������
		say();//�ڶ��ε���say()�����ҽ���
		feeling("���������������","(*^__^*)");
	}
	//����say������ʾ�����ҽ���
	private static void say() {		
		System.out.print("�ˣ���Һã�������"+name);
		System.out.print(",���꣺"+age+"��");
		System.out.print(",��ߣ�"+height+"��,");
		System.out.println("����һ��"+type+"��"+sex+"��");
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
	/**
	 * ����feeling������˵ĸ��顣
	 * @param cause:���������ԭ��
	 * @param content�����������
	 */
	static void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
}
