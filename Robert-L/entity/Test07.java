package com.eoe.pre.oop.day03.entity;

public class Test07 {
	public static void main(String[] args) {
		// Person02 p=new Person02();
		// p.setAge(250);
		// p.setName("李煒");
		// p.setHeight(2.50);
		// p.setSex('處');
		// p.setType("禽獸");
		// p.say();
		Student s = new Student();
		s.setName("小李");
		s.setSex('女');
		s.setAge(30);
		s.setHeight(1.7);
		s.setType("暴躁的");
		s.setInSchool("eoe极客学院");
		s.setInClass("android1205班");
		s.say();
		s.doing();
		Teacher t = new Teacher();
		t.setName("李個蛋");
		t.setSex('女');
		t.setAge(28);
		t.setHeight(1.9);
		t.setType("野蠻的");
		t.setInSchool("eoe极客学院");
		t.setInClass("android1205班");
		t.say();
		t.doing();
	}
}
