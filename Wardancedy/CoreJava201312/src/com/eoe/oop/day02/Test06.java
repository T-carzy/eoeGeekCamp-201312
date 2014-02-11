package com.eoe.oop.day02;

import java.util.Scanner;

public class Test06 {
	/**
	 * 常量示例
	 */
	static final int DO_WHILE_DEMO=1;
	static final int WHILE_DEMO=2;
	static final int FOR_DEMOE=3;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-do while循环示例");
		System.out.println("2-while循环示例");
		System.out.println("3-for循环示例");
		System.out.println("选择1-3");
		int select=scanner.nextInt();
		switch (select) {
		case DO_WHILE_DEMO:
			//打印do while源代码
			System.out.println(
				"int i1=1;\n"+
				"do{\n"+
				"    System.out.println(i1);\n"+
				"    i1++;\n"+
				"}while(i1<=10);" 
			);
			//打印结果
			int i1=1;
			do{
				System.out.println(i1);
				i1++;
			}while(i1<=10);
			break;
		case WHILE_DEMO:
			System.out.println(
				"int i2=1;\n"+
				"while(i2<=10){\n"+
				"    System.out.println(i2);\n"+
				"    i2++;\n"+
				"}" 
			);
			int i2=1;
			while(i2<=10){
				System.out.println(i2);
				i2++;
			}
			break;
		case FOR_DEMOE:
			System.out.println(
				"for(int i3=1;i3<=10;i3++){\n"+
				"    System.out.println(i3);\n"+
				"}"
			);
			for(int i3=1;i3<=10;i3++){
				System.out.println(i3);
			}
		}
	}
}
