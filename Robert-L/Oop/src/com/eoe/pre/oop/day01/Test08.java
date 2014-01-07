package com.eoe.pre.oop.day01;
public class Test08 {
	public static void main(String[] args) {
		Student s1 = new Student("张小飞", '男', 23, 1.89, "eoe极客学院",
				"android1205班", "豪放的");
		s1.say();
		s1.feeling("俺失恋啦", "哇哇...");
		System.out.println("俺给大家表演两个变量相交换的算法");
		int[] aa={10,100};
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		s1.swap(aa, 0,1);
		System.out.println("变");
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		Student s2 = new Student("李伟", '男', 20, 1.7, "eoe极客学院",
			"android1205班", "热情大方");
		s2.say();
		s2.feeling("俺中了五百万！", "哈哈...");
		System.out.println("俺给大家表演两个变量相交换的算法");
		aa=new int[]{1000,10000};
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		s2.swap(aa, 0,1);
		System.out.println("变");
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
	}

}
