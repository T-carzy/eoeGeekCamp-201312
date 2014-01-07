package com.eoe.oop.day01;

public class Exercise01 {

	public Exercise01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Exercise01_1.java用非面向对象的方 式创建并显示了两个老师的相关信息。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "邢俊凤";
		char sex = '女';
		int age = 30;
		double height = 1.8;
		String type = "认真的";
		System.out.println("我叫" + name + "今年" + age + "岁，我是一个" + type + sex
				+ "士");
		String name1 = "王博";
		char sex1 = '男';
		int age1 = 32;
		double height1 = 1.8;
		String type1 = "恐怖的";
		System.out.println("我叫" + name1 + "今年" + age1 + "岁，我是一个" + type1 + sex1
				+ "士");
	}

}
