package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;

public class Test04 {
	static final String sdir="E:/java_test/se2_day02";
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int select=0;
		File dir=new File(sdir);
		do{
			System.out.println("��ǰ�ļ��У�"+dir.getAbsolutePath());
			System.out.println("1-������һ��Ŀ¼");
			System.out.println("2-������һ���ļ���");
			System.out.println("3-����");
			select=input.nextInt();
			switch(select){
			case 1:
				//������һ��Ŀ¼
				if(dir.getParentFile().exists()&&
					dir.getParentFile()!=null){
					dir=dir.getParentFile();
					System.out.println(dir.getAbsolutePath());
					for(File f:dir.listFiles()){
						System.out.println(f.getName());
					}
				}else{
					System.out.println("�Ѿ��ﵽ���ļ���");
				}
				break;
			case 2://������һ���ļ���
				boolean existDir=false;
				for(File f:dir.listFiles()){
					if(f.isDirectory()){
						dir=f;
						//�����ļ���
						for(File f2:dir.listFiles()){
							System.out.println(f2.getName());
						}
						existDir=true;
						break;
					}
				}
				if(!existDir){
					System.out.println("û����һ���ļ���");
				}
				break;
			}
		}while(select!=3);
	}
}
