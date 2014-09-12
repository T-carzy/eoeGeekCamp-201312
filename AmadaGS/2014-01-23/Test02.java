package com.eoe.se2.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		initDir();
		int N=8;
		Scanner input=new Scanner(System.in);
		System.out.println("1-�����ļ�����·��");
		System.out.println("2-�����ļ�����·����Fileʵ��");
		System.out.println("3-�����ļ�·���ַ���");
		System.out.println("4-�����ļ���");
		System.out.println("5-�����ļ���Ŀ¼·��");
		System.out.println("6-�����ļ����ڵ��ļ���·��");
		System.out.println("7-�ж�ָ��·���Ƿ�ΪĿ¼");
		System.out.println("8-�ж�ָ��·���Ƿ�Ϊ�ļ�");
		System.out.println("select(1-"+N+")");
		int select=input.nextInt();
		String strFile="d:/se2/day01/java.txt";
		switch(select){
		case 1:
			File file1=new File(strFile);
			if(file1.exists()){
				System.out.println(file1.getAbsolutePath());
			}
			break;
		case 2:
			File file2a=new File(strFile);
			File file2b=file2a.getAbsoluteFile();
			if(file2b.exists()){
				System.out.println(file2b.getAbsolutePath());
			}
			break;
		case 3:
			File file3=new File(strFile);
			System.out.println(file3.getPath());
			break;
		case 4:
			File file4=new File(strFile);
			if(file4.exists()){
				System.out.println("�ļ���:"+file4.getName());
			}else{
				System.out.println("�ļ�������");
			}
			break;
		case 5:
			File file5=new File(strFile);
			File parent5=file5.getParentFile();
			System.out.println(parent5.getParent());
			break;
		case 6:
			File file6=new File(strFile);
			String dir6=file6.getParent();
			System.out.println(dir6);
			
		}
	}

    static void initDir() {
		File dir=new File("d:/se2/day01");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file=new File(dir,"java.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
