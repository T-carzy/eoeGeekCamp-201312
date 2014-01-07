package com.eoe.oop.day01;

public class Work04 {

	public Work04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("张小飞", '男', 18, 1.89, "eoe极客学院",
				"Android1205班", "凶残的");
		s1.say();
		s1.feeling("我失恋了", "哇哇...");
		System.out.println("我给大家表演一个两个变量相交换的算法");
		int[] a = { 10, 100 };
		System.out.println("a=" + a[0] + " b=" + a[1]);
		s1.swap(a, 0, 1);
		System.out.println("变");
		System.out.println("a=" + a[0] + "b=" + a[1]);
		Student s2 = new Student("王小飞", '男', 23, 1.89, "eoe极客学院",
				"android1205班", "豪放的");
		s2.say();
		s2.feeling("俺失恋啦", "哇哇...");
		System.out.println("俺给大家表演两个变量相交换的算法");
		a = new int[] { 1000, 10000 };
		System.out.println("a=" + a[0] + "  b=" + a[1]);
		s2.swap(a, 0, 1);
		System.out.println("变");
		System.out.println("a=" + a[0] + "  b=" + a[1]);

	}

}
