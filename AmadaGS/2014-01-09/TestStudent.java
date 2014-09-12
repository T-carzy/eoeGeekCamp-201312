package com.eoe.Oop;

import java.util.Arrays;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("张飞", '男', 23, 1.80, "外向的", "eoe极客训练营",
				"Android 1205班");
		s1.say();
		s1.feeling("我中了五百万", "哈哈哈哈哈。。。");
		int[] a = { 23, 87 };
		System.out.println("我给大家变个魔术");
		System.out.println("a[0]=" + a[0] + " a[1]=" + a[1]);
		System.out.println("变");
		s1.swap(a, 0, 1);
		System.out.println("a[0]=" + a[0] + " a[1]=" + a[1]);
		// 第二個人
		Student s2 = new Student("劉亦菲", '女', 23, 1.80, "外向的", "eoe极客训练营",
				"Android 1205班");
		s2.say();
		System.out.println("造了" + Student.count + "個人");
	}
}
