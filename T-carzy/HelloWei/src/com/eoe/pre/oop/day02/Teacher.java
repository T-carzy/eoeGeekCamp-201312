package com.eoe.pre.oop.day02;

import java.util.Arrays;

import com.eoe.pre.oop.day01.Person1;

public class Teacher extends Person1 {

	public String inSchool;
	public String inClass;

	@Override
	public void say() {
		super.say();
		System.out.println("我在"+inSchool+inClass+"教书");
	}
	public Teacher(){
	}

	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		super(name, sex, age, height, type);
		this.inClass = inClass;
		this.inSchool = inSchool;
	}

	public void swap(int[] a, int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("擦擦", '女', 22, 2.22, "狂野的", "极客学院", "安卓1205");
		t.say();
		System.out.println(t.name);
		t.feeling("我失恋了", "哈哈哈。。。");
		System.out.println("变个戏法：");
		int[] aa = { 200, 300 };
		System.out.println(Arrays.toString(aa));
		t.swap(aa, 0, 1);
		System.out.println("我了个去：" + Arrays.toString(aa));
	}

}
