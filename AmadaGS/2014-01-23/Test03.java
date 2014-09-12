package com.eoe.se2.day02;

import java.io.File;
import java.io.FileFilter;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *  lastModified()�����ظ��ļ�������ʱ���־
	length()�������ļ�����
	list()�������ļ���Ŀ¼�嵥
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-��ȡ�ļ��޸ĵ����ʱ��");
		System.out.println("2-�����ļ�����");
		System.out.println("3-��ȡ��ǰ�ļ����������ļ����ļ���");
		System.out.println("4-��ȡ��ǰ�ļ���������java�ļ�");
		
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
			System.out.println("Test04.java�ĳ��ȣ�"+dir.length());
		}
	}

	private static void getFileModifield() {
		// TODO Auto-generated method stub
		String path="E:\\java_test\\se2_day02";
		File dir=new File(path);
		if(!dir.exists()){
			System.out.println("�ļ��в�����");
			return;
		}
		File file=new File(dir,"Test04.java");
		if(!file.exists()){
			System.out.println(file.getAbsolutePath()+"������");
			return;
		}
		long time=file.lastModified();
		Date date=new Date(time);
		String sdate=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(date);
		System.out.println(sdate);
	}
}