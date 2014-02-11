package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;

public class Test02 {
	public static void main(String[] args) {
//		Object o1=new Object();
//		Object o2=new Object();
//		System.out.println("o1与o2是一个对象:"+o1.equals(o2));
//		o1=o2;
//		System.out.println("o1与o2是一个对象:"+(o1==o2));
		Person p=new Person();
		p.name="张飞";
		System.out.println(p.toString());
		System.out.println(p);
		Student stu=new Student();
	}
}
