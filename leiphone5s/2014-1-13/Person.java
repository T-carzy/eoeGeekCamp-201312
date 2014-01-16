package com.eoe.oop.day03.entity;

import java.util.Arrays;

@SuppressWarnings("unused")
public abstract class Person {
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
		if (sex == '��' || sex == 'Ů') {
			this.sex = sex;
		} else {
			this.sex = '��';
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 || age < 200) {
			this.age = age;
		} else {
			System.out.println("���䲻����");
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0 || height < 3) {
			this.height = height;
		} else {
			System.out.println("��߲�������");
		}
	}

	public String type() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void say() {
		System.out.println("����:" + name + "�Ա�:" + sex + "����:" + age
				+ "���:" + height + "�Ը�:" + type);
	}
public Person() {
	// TODO Auto-generated constructor stub
}

public Person(String name, char sex, int age, double height, String type) {
	super();
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.height = height;
	this.type = type;
}
public abstract void doing();
public static void main(String[] args) {
	
}
}
