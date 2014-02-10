package com.eoe.se2.day02;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/*
 * getAbsoluteFile()    返回文件完整路径的File实例
 getPath()   返回文件路径字符串
 getName()     返回文件名称
 getParent()   返回文件父目录路径
 getParentFile()  返回文件所在文件夹的路径	  
 */
public class Test02 {
	static String StrFile = "E:\\java_test\\se2_day02\\day01\\Text01.java";

	public static void main(String[] args) {
		System.out.println("1-返回文件完整路径的File实例");
		System.out.println("2-返回文件名");
		System.out.println("3-返回文件父目录路径");
		System.out.println("4-返回文件所在的文件夹路径");
		System.out.println("5-判断指定路径是否为目录");
		System.out.println("6-判断指定路径是否为文件");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		switch (select) {
		case 1:// 返回文件完整路径的File实例
			getAbsoluteFile();
			break;
		case 2:// 返回文件名
			getName();
			break;
		case 3:// 返回文件父目录路径
			getParent();
			break;
		case 4:// 返回文件所在的文件夹路径
			getParentFile();
			break;
		case 5:// 判断指定路径是否为目录
			isDirectory();
			break;
		case 6:// 判断指定路径是否为文件
			isFile();
			break;

		}
	}

	private static void isFile() {
		File file =new File(StrFile);
		if(file.exists()){
			System.out.println(file+" 是文件"+file.isFile());
		}
		
	}

	private static void isDirectory() {
		File floder = new File(StrFile);
		if (floder.exists()) {
			System.out.println(floder + "  是文件夹" + floder.isDirectory());
		}

	}

	private static void getParentFile() {
		File file = new File(StrFile);
		String dir = file.getParent();
		System.out.println(dir);
	}

	private static void getParent() {

		File file = new File(StrFile);
		File parent = file.getParentFile();
		System.out.println(parent.getPath());

	}

	private static void getName() {

		File file = new File(StrFile);
		if (file.isDirectory()) {
			System.out.println(file.getPath() + "  is floder");
		} else {
			System.out.println(file.getPath() + "   is file");
		}
		System.out.println(file.getName());
		System.out.println(file.getParent());
	}

	private static void getAbsoluteFile() {
		File floder = new File(StrFile);
		File parent = floder.getAbsoluteFile();
		System.out.println(parent.getPath());
	}
}
