package com.eoe.oop.day02;

import java.util.Scanner;

public class Test07 {
	/**
	 * �����ַ������Ͳ�����Ч��PK
	 */
	static final int STRING_ACTION=1;
	static final int STRING_BUIDER_ACTION=2;
	static final int STRING_BUFFER_ACTION=3;
	public static void main(String[] args) {		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-String���ַ������Ӳ���");
		System.out.println("2-StringBuilder���ַ������Ӳ���");
		System.out.println("3-StringBuffer���ַ������Ӳ���");
		System.out.println("ѡ��1-3");
		int select=scanner.nextInt();
		long start=System.currentTimeMillis();
		switch (select) {
		case STRING_ACTION:
			String str="";
			for(int i=1;i<=100000;i++){
				str+="a";
			}
			break;
		case STRING_BUIDER_ACTION:
			StringBuilder builder=new StringBuilder();
			for(int i=1;i<=500000;i++){
				builder.append("a");
			}
			break;
		case STRING_BUFFER_ACTION:
			StringBuffer buffer=new StringBuffer();
			for(int i=1;i<=500000;i++){
				buffer.append("a");
			}
			break;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost="+(end-start));
	}
}
