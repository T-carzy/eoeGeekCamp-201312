package com.eoe.basic.day03;

public class Test01_2 {
	/**
	 * 示例：演示静态变量的定义和使用
	 */
	static String name;
	static char sex;
	static int age;
	static double height;
	static String type;

	public static void main(String[] args) {
		System.out.print("嗨，大家好！，俺叫"+name);
		System.out.print(",今年："+age+"岁");
		System.out.print(",身高："+height+"米,");
		System.out.println("俺是一个"+type+"的"+sex+"生");	
		System.out.println("俺失恋啦！，呜呜...");
	}
}
