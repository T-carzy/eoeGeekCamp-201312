package com.eoe.pre.oop.day03;

import com.eoe.pre.oop.day03.entity.Person02;
import com.eoe.pre.oop.day03.entity.Student;
import com.eoe.pre.oop.day03.entity.Teacher;

public class Test10 {
	public static void main(String[] args) {
		// 父类的引用变量可以存放、操作子类的对象
		Person02 p = new Teacher();
		if (p instanceof Student) {
			Student s = (Student) p;
			s.say();
		} else {
			System.out.println("类型不匹配");
		}
	}
}
