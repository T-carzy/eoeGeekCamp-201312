package com.eoe.pre.oop.day03.entity;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student();
		s.setAge(22222);
		s.setHeight(2222.2222);
		s.setName("梁文峰");
		s.setType("较弱的");
		s.setInClass("android1205班");
		s.setSex('母');
		s.setInSchool("eoe极客工作坊");
		s.say();
		s.doing();
		s.feeling("我今天被张飞老师打死了", "啊哈哈。。。好爽，如果有机会我还想再来一次");
	}
}
