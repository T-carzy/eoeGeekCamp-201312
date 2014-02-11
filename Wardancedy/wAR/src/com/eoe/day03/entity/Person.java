package com.eoe.day03.entity;

public abstract class Person {

	static int count;
	protected String name;
	protected char sex;
	protected int age;
	protected double height;
	protected String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == '男' || sex == '女') {
			this.sex = sex;
		} else {
			this.sex = '男';
		}
	}

	public void say() {
		System.out.println("嗨，大家好，俺叫" + name + "，今年" + age + "岁,身高" + height
				+ "米,俺是一个" + type + sex + "士");
	}

	private void feeling(String cause, String content) {
		// TODO Auto-generated method stub
		System.out.println(cause);
		System.out.println(content);
	}

	public Person() {
		count++;
		name = "张三";
		sex = '女';
		age = 18;
		height = 1.7;
		type = "活泼的";

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, char sex) {
		this(name);
		this.sex = sex;
	}

	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Person other = null;
		if (obj instanceof Person) {
			other = (Person) obj;
		} else {
			return false;
		}
		if (obj == this) {
			return true;
		}
		return this.name.equals(other.name) && this.sex == other.sex;
	}

	public static void main(String[] args) {

	}

	public abstract void doing();
	}
