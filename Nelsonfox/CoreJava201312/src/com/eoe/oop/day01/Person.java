package com.eoe.oop.day01;

public class Person {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;

	public void say() {
		System.out.println("嗨，大家好，我叫" + name + "今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士");
	}

	// feeling方法是一个静态方法
	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// 无参构造方法，JVM默认提供一个构造方法

	public Person() {
		name = "张三";
		sex = '男';
		age = 18;
		height = 1.8;
		type = "活泼的";
		// sex='男';
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, char sex) {
		this(name);
		this.sex = sex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person("韩伟", '男', 18, 1.8, "活泼的");
		
		Person person2 = new Person("韩伟", '男', 18, 1.8, "活泼的");
		if(person.equals(person2)){
			System.out.println("是同一个人");
		}else{
			System.out.println("不是同一个人");
		}
	}

	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null){
			return false;
		}
		Person other=null;
		if(obj instanceof Person){
			other=(Person)obj;
		}else{
			return false;
		}
		if(obj==this){
			return true;
		}
		return this.name.equals(other.name)&&this.sex==other.sex
				&&this.age==other.age&&this.height-other.height<0.001
				&&this.equals(type)==other.equals(type);
	}

}
