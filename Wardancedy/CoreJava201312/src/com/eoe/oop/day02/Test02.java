package com.eoe.oop.day02;

import com.eoe.oop.day02.entity.Person;
import com.eoe.oop.day02.entity.Student;

public class Test02 {
	/**
	 * 父类与子类之间的类型转换
	 */
	public static void main(String[] args) {
		Student student=new Student();
		//子类的引用变量能赋值给父类的引用变量，类型自动转换为父类型
		Person person=student;
		student=(Student) person;
	}
}
