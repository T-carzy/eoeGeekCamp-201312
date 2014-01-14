package com.eoe.pre.oop.day03.entity;

public class TestTeacher {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setAge(45);
		t.setHeight(1.99);
		t.setName("张飞");
		t.setType("暴躁的");
		t.setWorker("武术指导");
		t.setSex('公');
		t.setInSchool("eoe极客工作坊");
		t.say();
		t.doing();
		t.feeling("我今天打死个同学，他叫梁文峰", "啊哈哈。。。好爽");
	}

}
