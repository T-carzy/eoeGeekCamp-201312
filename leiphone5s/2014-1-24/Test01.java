package se2.day04;

import java.io.File;
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
	case 1://��Ⲣ�����ļ���
		File root=new File("d:/se1");
		if(!root.exists()){
			System.out.println("d:/se1������");
			root.mkdir();
		}else{
			System.out.println("d:/se1����");
		}
		break;
	case 2://����Ƕ���ļ���
		File root2=new File("d:/se2");
		File dir=new File(root2,"day01");
		if(!dir.exists()){
			if(dir.mkdirs()){
			System.out.println("d:/se2/day01�ļ��д����ɹ�");
		}else{
			System.out.println("d:/se2/day01�ļ��д���ʧ��");
		}
	}else{
		System.out.println("d:/se2/day01�ļ���һ����");
	}
	break;
	case 3://�����ļ�
		File root3=new File("d:/se2");
		//File dir3
}
}
}
