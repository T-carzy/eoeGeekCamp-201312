package com.eoe.basic.day02_;

import java.util.Scanner;

public class Test09 {

	/**
	 * 张飞 男
	 */
	public static void main(String[] args) {
		//创建用于键盘输入的Scanner对象
		Scanner scanner=new Scanner(System.in);
		System.out.println("姓名:");
		String name=scanner.next();
		System.out.println("性别：");
		char sex=scanner.next().charAt(0);
		System.out.println("年龄：");
		int age=scanner.nextInt();
		System.out.println("身高:");
		double height=scanner.nextDouble();
		
		System.out.println("嗨，大家好，俺叫"+name+
			",今年"+age+"岁,身高"+height+
			"米,俺是一个"+sex+'士');
	}

}
