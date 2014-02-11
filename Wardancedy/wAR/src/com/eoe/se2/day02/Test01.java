package com.eoe.se2.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws IOException {
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
		case 4:
			createFile();
			break;
		case 5:
			delete();
			break;
		}
	}
	private static void delete() {
		// TODO Auto-generated method stub
		String path="d:wardance";
		File wdy=new File("d/wardance1");
		if (!wdy.exists()) {
			System.out.println("不存在");
		}else {
			wdy.delete();
			System.out.println("被删除");
				
			}
			
		}
	
	private static void createFile() throws IOException {
		// TODO Auto-generated method stub
		String path="d:/wardance";  
		File wdy=new File("d:/wardance1");
		if (!wdy.exists()) {
			wdy.mkdirs();
			
		}
		File file=new File(wdy,"java.text");
		file.createNewFile();
		
		
	}
	private static void createFolder() {
		String path="d:/wardance";
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
		String path="d:/wardance";
		File folder=new File(path);
		if(folder.exists()){
			System.out.println(folder.getAbsolutePath()+"已存在");
		}else{
			System.out.println(folder.getAbsolutePath()+"不存在");
		}
		
	}

}
