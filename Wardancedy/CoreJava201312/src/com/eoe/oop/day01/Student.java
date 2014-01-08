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
		System.out.println("嗨，大家好，俺叫" + name + ",今年" + age + "岁,身高" + height
				+ "米,俺是一个" + type + sex + "士");
		System.out.println("俺在" + inSchool + inClass + "学习");
	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	public void swap(int[] a, int i,int j) {
		a[i]+=a[j];
		a[j]=a[i]-a[j];
		a[i]-=a[j];
	}

	public Student() {

	}

	// altshift+s
	/**
	 * @param args
	 */
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
		Student s2 = new Student("王小飞", '男', 23, 1.89, "eoe极客学院",
				"android1205班", "豪放的");
		s2.say();
		s2.feeling("俺失恋啦", "哇哇...");
		System.out.println("俺给大家表演两个变量相交换的算法");
		aa=new int[]{1000,10000};
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		s2.swap(aa, 0,1);
		System.out.println("变");
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
	}

	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param inSchool
	 * @param inClass
	 * @param type
	 */
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
