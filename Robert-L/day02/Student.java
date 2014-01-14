package com.eoe.pre.oop.day02;

import java.util.Arrays;

public class Student extends Person {
	public String inSchool;// 所在学校
	public String inClass;// 所在班级

	// 无参构造方法

	public Student() {

	}

	// 带参构造方法
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		// 调用父类的带参构造方法，初始化name,sex,age,height和type属性
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}

	public void say() {
		super.say();// 调用父类中的say
		System.out.println("我在" + inSchool + inClass + "学习");
	}

	// 增加父类中没有的方法，实现两个变量值互换
	// public void swap
	public void swap(int[] a, int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;

	}

	public static void main(String[] args) {
		new Student();
		Student s1 = new Student("张小飞", '男', 25, 1.89, "开朗的", "eoe极客学院",
				"andriod1205班");
		s1.say();
		System.out.println(s1.name);
		s1.feeling("俺找到好工作,月薪8k", " 哈哈、、、、");
		System.out.println("俺给大家表演两个变量值互换的算法");
		int[] aa = { 10, 100 };
		System.out.println(Arrays.toString(aa));
		System.out.println("变");
		s1.swap(aa, 0, 1);
		System.out.println(Arrays.toString(aa));

	}
}
