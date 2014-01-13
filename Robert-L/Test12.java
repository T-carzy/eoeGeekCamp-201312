package com.eoe.pre.oop.day03;

import com.eoe.pre.oop.day02.Person;

public class Test12 {
	public static void main(String[] args) {
		Person p1 = new Person("张飞", '男', 23, 1.8, "开朗的");
		Person p2 = new Person("李玲", '女', 24, 1.6, "活泼的");
		if (p1.equals(p2)) {
			System.out.println("是一个人");
		} else {
			System.out.println("不是一个人");
		}

	}
}
