package com.eoe.oop.day02;

import com.eoe.oop.day01.Person;

public class Code09 {

	public Code09() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 父类与子类之间的类型转换
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 子类的引用变量能赋值给父类的引用变量，类型自动转换为父类型
		Student student = new Student();
		Person person = student;
		person.say();

		student = (Student) person;
		student.say();
	}

}
