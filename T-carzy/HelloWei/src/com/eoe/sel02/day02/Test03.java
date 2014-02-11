package com.eoe.sel02.day02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *  lastModified()：返回该文件最后更改时间标志
	length()：返回文件长度
	list()：返回文件和目录清单
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-获取文件修改的最后时间");
		System.out.println("2-返回文件长度");
		System.out.println("3-获取当前文件夹下所有文件和文件夹");
		System.out.println("4-获取当前文件夹下所有java文件");
		int select=scanner.nextInt();
		switch(select){
		case 1:
			getFilemodifield();
			break;
		case 2:
			getLenght();
			break;
		}
	}

	private static void getLenght() {
		String path="e:\\java_test\\se2_day02\\day01.txt";
		File file=new File(path);
		long size=file.length();
		System.out.println("文件长度"+file.length());
	}

	private static void getFilemodifield() {
		String path="e:\\java_test\\se2_day02";
		File dir=new File(path);
		if(!dir.exists()){
			System.out.println("文件不存在");
			return ;
		}
		File file=new File(dir, "Test01.java");
		if (!file.exists()) {
			System.out.println(file.getAbsolutePath()+"不存在");
			return ;
		}
		long time=file.lastModified();
		Date date=new Date(time);
		String sdate=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(date);
		System.out.println(sdate);
	}
}
