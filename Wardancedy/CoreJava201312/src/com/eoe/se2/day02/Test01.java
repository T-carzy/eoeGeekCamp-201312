package com.eoe.se2.day02;

import java.io.File;
import java.util.Scanner;

/**
 * 【示例-1】文件、文件夹的检测、创建和删除。
 * @author yw
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-检测文件夹是否存在");
		System.out.println("2-检测文件是否存在");
		System.out.println("3-创建文件夹");
		System.out.println("4-创建文件");
		int select=scanner.nextInt();
		switch (select) {
		case 1://检测文件夹是否存在
			checkFloder();
			break;		
		case 2://检测文件是否存在
			
			break;
		case 3://创建文件夹
			createFolder();
			break;
		}
	}
	private static void createFolder() {
		String path="f:/java_test/se2_day02";
		File folder=new File(path);
		if(!folder.exists()){
			folder.mkdirs();
			System.out.println(folder.getAbsolutePath()+"被创建");
		}else{
			System.out.println(folder.getAbsolutePath()+"已存在");
		}
	}
	//检测文件夹是否存在
	private static void checkFloder() {
		String path="f:/java_test";
		File folder=new File(path);
		if(folder.exists()){
			System.out.println(folder.getAbsolutePath()+"已存在");
		}else{
			System.out.println(folder.getAbsolutePath()+"不存在");
		}
		
	}
}
