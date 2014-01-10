package com.eoe.pre.oop.day02;

/**
 * Person类表示人类 重写Object.toString() 重写Object.equals()
 */
public class Person {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;

	/**
	 * 自定义构造方法， 1、为Person对象的各成员变量提供默认值 2、统计Person()被调用的次数
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}

	public void say() {
		System.out.println("嗨，大家好！，我叫" + name);
		System.out.println(",今年" + age + "岁，");
		System.out.println("我是一个" + type + sex + "士");
	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// 重写Object.toString(),返回对象的name属性
	@Override
	public String toString() {
		return this.name;
	}

	/**
	 * 重写Object.equals() 判断两个对象是否是一个人的标准是 姓名、性别、年龄、身高和性格都相等
	 */
	@Override
	public boolean equals(Object obj) {
		Person other = null;
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Person) {
			other = (Person) obj;
		} else {
			return false;
		}
		return this.name.equals(other.name) && this.sex == other.sex
				&& this.age == other.age && this.height == other.height
				&& this.type.equals(other.type);
	}

	/**
	 * 类的入口
	 */
	public static void main(String[] args) {
		// 创建第一个人
		Person p1 = new Person("张小飞", '男', 23, 1.89, "暴躁的");
		System.out.println(p1);
		// 创建第二个人
		Person p2 = new Person("张小飞", '女', 20, 1.79, "热情的");
		System.out.println(p2);
		if (p1.equals(p2)) {
			System.out.println("一个人");
		} else {
			System.out.println("不同一个人");
		}
	}
}
