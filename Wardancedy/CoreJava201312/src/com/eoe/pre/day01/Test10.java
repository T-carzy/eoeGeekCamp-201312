package com.eoe.pre.day01;

import java.util.Scanner;

public class Test10 {

	/**
	 * &&��������
	 * ��ϵ����1 && ��ϵ����2  ��������ϵ���㶼��trueʱ��
	 * ����������true
	 * 
	 *  ||:������
	 *  ��ϵ����1 || ��ϵ����2 
	 *  ��������ϵ����Ľ����һ����trueʱ��
	 *  ������Ľ����true��
	 *  �����㣺����ϵ���㣺��ϵ�����෴���
	 *  java�����﷨  java
	 *  android     android
	 *  ���ݿ�            sql
	 *  ��Ŀ               project
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("java=");
		int java=scanner.nextInt();
		System.out.println("android=");
		int android=scanner.nextInt();
		System.out.println("sql=");
		int sql=scanner.nextInt();
		System.out.println("project=");
		int project=scanner.nextInt();
		if(java>=90 && android>=90 && sql>=90 && project>=90){
			System.out.println("��ϲ����������˾¼�ã���н5k");
		}else if(java>=90 && android>=90 &&(sql>=90 || project>=90)){
			System.out.println("��ϲ����������˾¼�ã���н4k");
		}else if(java>=90 || android>=90 || sql>=90 || project>=90){
			System.out.println("��ϲ����������˾¼�ã���н3k");
		}else{
			System.out.println("��֪ͨ��");
		}
	}

}
