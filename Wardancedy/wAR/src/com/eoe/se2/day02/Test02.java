package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;

public class Test02 {
/*
 * g
 *
 */
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
	case 2:
		getFileName();
		break;
	}
}

private static void getFileName() {
String path="d:/wardance";
File file=new File(path,"wardance01");
System.out.println(file.getName());
System.out.println(file.getParent());
}

private static void getAbsolutePathFile() {
	// TODO Auto-generated method stub
	String path="d:/wardance";
	File folder=new File(path);
	File patent=folder.getAbsoluteFile();
	System.out.println(patent.getParent());
}
}
