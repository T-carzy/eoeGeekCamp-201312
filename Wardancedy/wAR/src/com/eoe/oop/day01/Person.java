package com.eoe.oop.day01;

public class Person {
	public static String name;
	public static char sex;
	public static int age;
	public static double height;
	public static String type;
	public static String inSchool;
	public static String inClass;
	private double heigt;

	public void say() {
		// TODO Auto-generated method stub
		System.out.println("嗨，大家好我叫" + name + "我是一个" + sex + "孩，我今年" + age
				+ "岁，我身高是" + height + "米，我是一个" + type + "人，我在"
				+ (String) inSchool + "的" + (String) inClass);
	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);

	}
public Person() {
	// TODO Auto-generated constructor stub
}
	public Person(String name2, char sex2, int age2, double height2, String type2) {
		name = "李伟";
		sex = '女';
		age = 20;
		heigt = 1.7;
		type = "变态的";
		inSchool = "EOE极客学院";
		inClass = "Andriond1205班";
	}

	public Person(String name, char sex) {
		this(name, sex, age, height, name);
		this.sex = sex;
	}

	public static void main(String[] args) {
		Person p1 = new Person(inClass, sex);
		p1.name = "李伟";
		p1.sex = '女';
		p1.age = 20;
		p1.height = 1.6;
		p1.type = "变态的";
		inSchool = "EOE极客学院";
		inClass = "Andriond1205班";
		p1.say();
		p1.feeling("我结婚了", "哈哈....");
		p1.feeling("我离婚了", "呜呜..........");

		p1 = new Person(inClass, sex);
		p1.name = "韩伟";
		p1.sex = '男';
		p1.age = 25;
		p1.height = 1.7;
		p1.type = "温和的";
		inSchool = "EOE极客学院";
		inClass = "Andriond1205班";
		p1.say();
		p1.feeling("我结婚了", "哈哈....");
		p1.feeling("我离婚了", "呜呜..........");

	}
}