package com.eoe.oop.day02_;

import java.util.Scanner;

/*
 * 演示三种循环的代码和运行效果。
 */
public class Test05 {
	
	public static void main(String[] args) {
		 final int DO_WHILE_DEMO=1;
		 final int WHILE_DEMO=2;
		 final int FOR_DEMO=3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-do while循环");
		System.out.println("2-while循环");
		System.out.println("3-for循环");
		int select=scanner.nextInt();
		switch (select) {
		case DO_WHILE_DEMO:
			System.out.println(
				"i=1;"+"\n"+
				"do{"+"\n"+
			    "    i=i+1;"+"\n"+
				"while(i<=5);");
			break;
		case WHILE_DEMO:
			System.out.println(
					"i=1;"+"\n"+
					"while(i<=5){"+"\n"+
				    "    i=i+1;"+"\n"+
					"}");
			break;
		case FOR_DEMO:
			System.out.println(
					"for(int i=1;i<=5;i++){"+"\n"+
				    "    i=i+1;"+"\n"+
					"}");
			break;
		}
	}
}
