package com.eoe.se2.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int select;
		System.out.println("1-��Ⲣ�����ļ���");
		System.out.println("2-����Ƕ���ļ���");
		System.out.println("3-�����ļ�");
		System.out.println("4-ɾ���ļ�");
		System.out.println("select(1-4)");
		select=input.nextInt();
		switch(select){
		case 1:
			File root=new File("d:/se1");
			if(!root.exists()){
				System.out.println("d:/se1������");
				root.mkdir();
			}else{
				System.out.println("d:/se1����");
			}
			break;
		case 2:
			File root2=new File("d:/se2");
			File dir=new File(root2,"day01");
			if(!dir.exists()){
				if(dir.mkdirs()){
					System.out.println("d:/se2/day01�ļ��д����ɹ�");
				}else{
					System.out.println("d:/se2/day01�ļ��д���ʧ��");
				}
			}else{
				System.out.println("d:/se2/day01�ļ����Ѵ���");
			}
			break;
		case 3:
			File root3=new File("d:/se2");
			File dir3=new File(root3,"day01");
			if(!dir3.exists()){
				dir3.mkdirs();
			}
			File file3=new File(dir3,"java.txt");
			if(!file3.exists()){
				try {
					file3.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case 4:
			File root4=new File("d:/se2");
			File dir4=new File(root4,"day01");
			if(!dir4.exists()){
				System.out.println("�ļ��в�����");
			}else{
				File file4=new File(dir4,"java.txt");
				if(!file4.exists()){
					System.out.println("java.txt������");
				}else{
					file4.delete();
					System.out.println("java.txt��ɾ��");
				}
			}
			break;
		}
	}
}
