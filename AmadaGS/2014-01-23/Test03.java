package com.eoe.se2.day02;

import java.io.File;
import java.io.FileFilter;
import java.text.BreakIterator;
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
			getFileModifield();
			break;
		case 2:
			length();
			break;
		case 3:
			getDirLists();
			break;
		case 4:
			getJavaFile();
		    break;
		}
		
		
	}

	private static void getJavaFile() {
		// TODO Auto-generated method stub
		String path="E:\\java_test\\se2_day02";
		File dir=new File(path);
		File[] files=dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				
				return file.isFile()&&
					file.getPath().endsWith("java");
			}
		});
		for(File file:files){
			System.out.println(file.getName());
		}
	}

	private static void getDirLists() {
		// TODO Auto-generated method stub
		String path="E:\\java_test\\se2_day02";
		File dir=new File(path);
		File[] files=dir.listFiles();
		for(File file:files){
			long time=file.lastModified();
			Date date=new Date(time);
			String sdate=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(date);
			String text=file.isFile()?"file":"folder";
			System.out.println(file.getName()+"\t"+text+"\t"+sdate);
		}
	}

	private static void length() {
		// TODO Auto-generated method stub
		String path="E:\\java_test\\se2_day02";
		File dir=new File(path,"Test04.java");
		if(dir.exists()){
			System.out.println("Test04.java的长度："+dir.length());
		}
	}

	private static void getFileModifield() {
		// TODO Auto-generated method stub
		String path="E:\\java_test\\se2_day02";
		File dir=new File(path);
		if(!dir.exists()){
			System.out.println("文件夹不存在");
			return;
		}
		File file=new File(dir,"Test04.java");
		if(!file.exists()){
			System.out.println(file.getAbsolutePath()+"不存在");
			return;
		}
		long time=file.lastModified();
		Date date=new Date(time);
		String sdate=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(date);
		System.out.println(sdate);
	}
}