package com.eoe.sel02.day02;

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
		switch(select){
		case 1:
			getAbsolutePathFile();
			break;
		case 2://返回文件名
			getFileName();
			break;
		case 3:
			getParentDirName();
			break;
		case 4:
			getNowFolderDirName();
			break;
		case 5:
			getIsDirectory();
			break;
		case 6:
			getIsFile();
			break;
		}
}

	private static void getIsFile() {
		String path="e:/java_test/se2_day02";
		File foldar=new File(path,"e:/java_test/se2_day02");
		if(foldar.isFile()){
			System.out.println("是文件夹");
		}else{
			System.out.println("是目录");
		}
	}

	private static void getIsDirectory() {
		String path="e:/java_test/se2_day02";
		File dir=new File(path,"e:/java_test");
		if (dir.isDirectory()) {
			System.out.println("是文件夹");
		}else
			System.out.println("是目录");
	}

	private static void getNowFolderDirName() {
		String path="e:/java_test/se2_day02";
		File file=new File(path,"se2_day02");
		System.out.println(file.getParentFile());
	}

	private static void getParentDirName() {
		String path="e:/java_test/se2_day02";
		File file=new File(path);
		System.out.println(file.getParent());
	}

	private static void getFileName() {
		String path="e:/java_test/se2_day02";
		File file=new File(path,"Test00.java");
		System.out.println(file.getName());
		System.out.println(file.getParentFile());
	}

	private static void getAbsolutePathFile() {
		String path="e:/java_test/se2_day02";
		File file=new File(path);
		File parent=file.getAbsoluteFile();
		System.out.println(parent.getPath());
	}
}
