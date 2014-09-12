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
			System.out.println("当前文件夹："+dir.getAbsolutePath());
			System.out.println("1-返回上一级目录");
			System.out.println("2-进入下一级文件夹");
			System.out.println("3-结束");
			select=input.nextInt();
			switch(select){
			case 1:
				//返回上一级目录
				if(dir.getParentFile().exists()&&
					dir.getParentFile()!=null){
					dir=dir.getParentFile();
					System.out.println(dir.getAbsolutePath());
					for(File f:dir.listFiles()){
						System.out.println(f.getName());
					}
				}else{
					System.out.println("已经达到根文件夹");
				}
				break;
			case 2://进入下一级文件夹
				boolean existDir=false;
				for(File f:dir.listFiles()){
					if(f.isDirectory()){
						dir=f;
						//遍历文件夹
						for(File f2:dir.listFiles()){
							System.out.println(f2.getName());
						}
						existDir=true;
						break;
					}
				}
				if(!existDir){
					System.out.println("没有下一级文件夹");
				}
				break;
			}
		}while(select!=3);
	}
}
