package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;
/*
 * getAbsoluteFile()    返回文件完整路径的File实例
   getPath()   返回文件路径字符串
   getName()     返回文件名称
   getParent()   返回文件父目录路径
   getParentFile()  返回文件所在文件夹的路径	  
 */

public class Test02 {
	public static void main(String[] args) {
		System.out.println("1-返回文件完整路径的File实例");
		System.out.println("2-返回文件名");
		System.out.println("3-返回文件父目录路径");
		System.out.println("4-返回文件所在的文件夹路径");
		System.out.println("5-判断指定路径是否为目录");
		System.out.println("6-判断指定路径是否为文件");
		Scanner scanner=new Scanner(System.in);
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			getAbsolutePathFile();
			break;
		case 2://返回文件名
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
