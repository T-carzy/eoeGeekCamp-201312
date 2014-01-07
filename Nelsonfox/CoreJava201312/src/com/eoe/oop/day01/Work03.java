package com.eoe.oop.day01;

public class Work03 {

	public Work03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "梁文峰";
		char sex = '男';
		int age = 25;
		double height = 1.7;
		String type = "豪放的";
		String inSchool = "eoe极客学院";
		String inClass = "Android1205班";
		System.out.println("嗨，大家好，我叫" + name + "今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士");
		System.out.println("我在" + inSchool + inClass + "学习");
		System.out.println("我给大家表演一个两变量交换的算法");
		int a = 10, b = 100;
		System.out.println("a=" + a + " b=" + b);
		a += b;
		b = a - b;
		a -= b;
		System.out.println("变");
		System.out.println("a=" + a + "b=" + b);
		System.out.println("我找到好工作了，月薪8K" + "嘻嘻...");
		// 第二个学员
		name = "高珊";
		sex = '女';
		age = 22;
		height = 1.69;
		type = "活泼的";
		inSchool = "eoe极客学院";
		inClass = "Android1205班";
		System.out.println("嗨，大家好，我叫" + name + "今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士");
		System.out.println("我在" + inSchool + inClass + "学习");
		System.out.println("我给大家表演一个两变量交换的算法");
		a = 100;
		b = 1000;
		System.out.println("a=" + a + " b=" + b);
		a += b;
		b = a - b;
		a -= b;
		System.out.println("变");
		System.out.println("a=" + a + "b=" + b);
		System.out.println("我找到好工作了，月薪8K" + "嘻嘻...");
	}

}
