package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;

/**
 * ��ʾ��-1���ļ����ļ��еļ�⡢������ɾ����
 * @author yw
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-����ļ����Ƿ����");
		System.out.println("2-����ļ��Ƿ����");
		System.out.println("3-�����ļ���");
		System.out.println("4-�����ļ�");
		int select=scanner.nextInt();
		switch (select) {
		case 1://����ļ����Ƿ����
			checkFloder();
			break;		
		case 2://����ļ��Ƿ����
			
			break;
		case 3://�����ļ���
			createFolder();
			break;
		}
	}
	private static void createFolder() {
		String path="f:/java_test/se2_day02";
		File folder=new File(path);
		if(!folder.exists()){
			folder.mkdirs();
			System.out.println(folder.getAbsolutePath()+"������");
		}else{
			System.out.println(folder.getAbsolutePath()+"�Ѵ���");
		}
	}
	//����ļ����Ƿ����
	private static void checkFloder() {
		String path="f:/java_test";
		File folder=new File(path);
		if(folder.exists()){
			System.out.println(folder.getAbsolutePath()+"�Ѵ���");
		}else{
			System.out.println(folder.getAbsolutePath()+"������");
		}
		
	}
}
