package com.eoe.pre.oop.day02;

public class Test03 {
	/**
	 * 父类与子类之间的类型转换
	 */
	public static void main(String[] args) {
		Person student = new Student();
		// 子类的引用变量能赋值给父类的引用变量，类型自动转换为父类型
		Person person = student;
		student = (Student) person;

	}
}
