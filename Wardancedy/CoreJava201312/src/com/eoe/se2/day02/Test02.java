package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;
/*
 * getAbsoluteFile()    �����ļ�����·����Fileʵ��
   getPath()   �����ļ�·���ַ���
   getName()     �����ļ�����
   getParent()   �����ļ���Ŀ¼·��
   getParentFile()  �����ļ������ļ��е�·��	  
 */

public class Test02 {
	public static void main(String[] args) {
		System.out.println("1-�����ļ�����·����Fileʵ��");
		System.out.println("2-�����ļ���");
		System.out.println("3-�����ļ���Ŀ¼·��");
		System.out.println("4-�����ļ����ڵ��ļ���·��");
		System.out.println("5-�ж�ָ��·���Ƿ�ΪĿ¼");
		System.out.println("6-�ж�ָ��·���Ƿ�Ϊ�ļ�");
		Scanner scanner=new Scanner(System.in);
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			getAbsolutePathFile();
			break;
		case 2://�����ļ���
			getFileName();
			break;
		}
	}

	private static void getFileName() {
		String path="f:/java_test/se2_day02";
		File file=new File(path, "Test00.java");
		System.out.println(file.getName());
		System.out.println(file.getParent());
	}

	private static void getAbsolutePathFile() {
		String path="f:/java_test/se2_day02";
		File folder=new File(path);
		File parent=folder.getAbsoluteFile();
		System.out.println(parent.getPath());
	}
}
