package com.eoe.oop.day01;

public class Student {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String inSchool;
	public String inClass;
	public String type;

	public void say() {
		System.out.println("嗨，大家好，我叫" + name + "，今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士");
		System.out.println("我在" + inSchool + inClass + "学习");

	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	public void swap(int[] a, int i, int j) {
		a[i] += a[j];
		a[j] = a[i] - a[j];
		a[i] -= a[j];
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("韩伟", '男', 18, 1.8, "eoe极客学院",
				" Android1205班", "温和的");
		s1.say();
		s1.feeling("我失恋了", "呜呜呜....");
		System.out.println("我给大家表演两个变量交换");
		int a[] = { 10, 100 };
		System.out.println("a=" + a[0] + "b=" + a[1]);
		s1.swap(a, 0, 1);
		System.out.println("变");
		System.out.println("a=" + a[0] + "b=" + a[1]);
		Student s2 = new Student("王鹏", '男', 18, 1.8, "eoe极客学院",
				" Android1205班", "温和的");
		s2.say();
		s2.feeling("我失恋了", "哇哇....");
		System.out.println("我给大家表演两个变量的交换");
		a = new int[] { 1000, 10000 };
		System.out.println("a=" + a[0] + "b=" + a[1]);
		s2.swap(a, 0, 1);
		System.out.println("变");
		System.out.println("a=" + a[0] + "b=" + a[1]);
	}

	public Student(String name, char sex, int age, double height,
			String inSchool, String inClass, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.inSchool = inSchool;
		this.inClass = inClass;
		this.type = type;
	}
}
