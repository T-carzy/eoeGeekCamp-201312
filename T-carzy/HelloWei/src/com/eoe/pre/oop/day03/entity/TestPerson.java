package com.eoe.pre.oop.day03.entity;

public class TestPerson {


	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setAge(2222);
		p.setSex('母');
		p.setType("变态的");
		p.setName("梁文峰");
		p.setHeight(1111.11);
		p.say();
		p.feeling("我失恋了", "好爽啊，啊哈哈哈哈。。。");
	}

}
