package com.eoe.se2.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		initDir();
		int N=8;
		Scanner input=new Scanner(System.in);
		System.out.println("1-返回文件完整路径");
		System.out.println("2-返回文件完整路径的File实例");
		System.out.println("3-返回文件路径字符串");
		System.out.println("4-返回文件名");
		System.out.println("5-返回文件父目录路径");
		System.out.println("6-返回文件所在的文件夹路径");
		System.out.println("7-判断指定路径是否为目录");
		System.out.println("8-判断指定路径是否为文件");
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
				System.out.println("文件名:"+file4.getName());
			}else{
				System.out.println("文件不存在");
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
