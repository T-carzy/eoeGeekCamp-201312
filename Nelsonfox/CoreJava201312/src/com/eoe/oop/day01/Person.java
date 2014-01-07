package com.eoe.oop.day01;

public class Person {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;

	public void say() {
		System.out.println("嗨，大家好，我叫" + name + "今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士");
	}

	// feeling方法是一个静态方法
	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// 无参构造方法，JVM默认提供一个构造方法

	public Person() {
		name = "张三";
		sex = '男';
		age = 18;
		height = 1.8;
		type = "活泼的";
		// sex='男';
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, char sex) {
		this(name);
		this.sex = sex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person("张飞", '女');
		person.say();
		Person person2 = new Person();
	}

}
