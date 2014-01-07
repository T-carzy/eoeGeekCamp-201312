package com.eoe.pre.oop.day01;

public class Person {
	public String name="李伟";
	public char sex='男';
	public int age=23;
	public double height=1.7;
	public String type="热情大方";

	public void say() {
		System.out.println("嗨，大家好！我叫 " + name + "，今年" + age + "岁 ，身高" + height
				+ "米，我是一个" + type + sex + "士");

	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);

	}

	public static void main(String[] args) {
		//args=null;
		System.out.println(args.length);
		args=new String[5];
		Person p1 = new Person();
		
	    p1.name = "李伟";
		p1.sex = '男';
		p1.height = 1.7;
		p1.age = 25;
		p1.type = "暴躁的";
		p1.say();
		p1.feeling("我走挑花运了", "哈哈、、、");
	}

}
