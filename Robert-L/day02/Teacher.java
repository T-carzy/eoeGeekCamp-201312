package com.eoe.pre.oop.day02;

import java.util.Arrays;

public class Teacher extends Person {
	public String inSchool;
	public String worker;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void say() {
		super.say();
		System.out.println("我在" + inSchool + worker + "工作");
	}

	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
	}

	// 增加父类没有的方法，实现两个变量值互换
	public void swap(int[] a, int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public static void main(String[] args) {
		new Teacher();
		Teacher t1 = new Teacher("张三", '男', 30, 1.78, "开朗的", "eoe极客学院", "任教");
		t1.say();
		t1.feeling("我要回家了", "哈哈、、、");
		System.out.println("我给大家表演两个变量值互换的算法");
		int aa[] = { 10, 50 };
		System.out.println(Arrays.toString(aa));
		System.out.println("变");
		t1.swap(aa, 0, 1);
		System.out.println(Arrays.toString(aa));

	}
}
