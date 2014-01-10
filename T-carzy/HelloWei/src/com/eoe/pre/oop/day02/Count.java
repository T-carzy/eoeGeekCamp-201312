package com.eoe.pre.oop.day02;

import java.util.Scanner;

public class Count {
	static final int STRING_ACTION=1;
	static final int STRINGBUILDER_ACTION=2;
	static final int STRINGBUFFER_ACTION=3;


	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("1-String连接字符串");
			System.out.println("2-StringBuilder连接字符串");
			System.out.println("3-StringBuffer连接字符串");
			int select=scanner.nextInt();
			switch(select){
			case STRING_ACTION:
				stringConcat();
				break;
			case STRINGBUILDER_ACTION:
				stringBufferConcat();
				break;
			case STRINGBUFFER_ACTION:
				stringBufferConcat();
				break;
			}
	}
	private static void stringConcat() {
		String s="";
		long start=System.currentTimeMillis();
		for(int i=1;i<=999999;i++){
			s+="o";
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"毫秒");
	}
	private static void stringBuilderConcat() {
		StringBuilder sb=new StringBuilder();
		long  start=System.currentTimeMillis();
		for(int i=1;i<=999999;i++){
			sb.append("o");
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"毫秒");
	}
	private static void stringBufferConcat() {
		StringBuilder sb=new StringBuilder();
		long start=System.currentTimeMillis();
		for(int i=1;i<=999999;i++){
			sb.append("o");
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"毫秒");
		
	}
	

}
