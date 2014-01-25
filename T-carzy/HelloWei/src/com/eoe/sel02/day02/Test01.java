package com.eoe.sel02.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * 【示例-1】文件、文件夹的检测、创建和删除。
 * @author yw
 *
 */
public class Test01 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("1-检查文件夹是否存在");
	System.out.println("2-检查文件是否存在");
	System.out.println("3-创建文件夹");
	System.out.println("4-创建文件");
	int select=scanner.nextInt();
	switch(select){
	case 1:
		checkfolder();
		break;
	case 2:
		checkWenJian();
		break;
	case 3:
		createfolder();
		break;
	case 4:
		createWenJian();
		break;
	}
}

	private static void createfolder() {
		String path="e:/java_test/se2_day02";
		File folder=new File(path);
		if(!folder.exists()){
			folder.mkdirs();
			System.out.println(folder.getAbsolutePath()+"被创建");
		}else{
			System.out.println(folder.getAbsolutePath()+"已存在");
		}
	}

	private static void checkfolder() {
		String path="e:/java_test/se2_day02";
		File folder=new File(path);
		if (folder.exists()) {
			System.out.println(folder.getAbsolutePath()+"被创建");
			
		}else{
		      System.out.println(folder.getAbsolutePath()+"已存在");
		      }
	}

	private static void createWenJian() {
		String path="e:/java_test/se2_day02";
		File wenJian=new File(path);
		if(!wenJian.exists()){
			try {
				wenJian.createNewFile();
				System.out.println(wenJian.getAbsolutePath()+"被创建");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println(wenJian.getAbsolutePath()+"没有此文件");
		}
	}

	private static void checkWenJian() {
			String path="e:/java_test/day01.txt";
			File folder=new File(path);
			if(folder.exists()){
			System.out.println(folder.getAbsolutePath()+"文件存在");
			}else{
				System.out.println(folder.getAbsolutePath()+"文件不存在");
			}
			
	}
}
