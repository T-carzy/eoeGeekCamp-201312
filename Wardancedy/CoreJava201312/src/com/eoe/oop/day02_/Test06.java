package com.eoe.oop.day02_;

import java.util.Scanner;

public class Test06 {
	static final int STRING_ACTION=1;
	static final int STRINGBUILDER_ACTION=2;
	static final int STRINGBUFFER_ACTION=3;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-StringÁ¬½Ó×Ö·û´®");
		System.out.println("2-StringBuilderÁ¬½Ó×Ö·û´®");
		System.out.println("3-StringBufferÁ¬½Ó×Ö·û´®");
		int select=scanner.nextInt();
		switch (select) {
		case STRING_ACTION:
			stringConcat();
			break;
		case STRINGBUILDER_ACTION:
			stringBuilderConcat();
			break;
		case STRINGBUFFER_ACTION:
			stringBufferConcat();
			break;
		}
	}
	private static void stringBufferConcat() {
		StringBuffer sb=new StringBuffer();
		long start=System.currentTimeMillis();
		for(int i=1;i<=500000;i++){
			sb.append("a");
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"ºÁÃë");
	}
	private static void stringBuilderConcat() {
		StringBuilder sb=new StringBuilder();
		long start=System.currentTimeMillis();
		for(int i=1;i<=500000;i++){
			sb.append("a");
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"ºÁÃë");	
	}
	private static void stringConcat() {
		String s="";
		long start=System.currentTimeMillis();
		for(int i=1;i<=100000;i++){
			s+="a";
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)+"ºÁÃë");
	}
}
