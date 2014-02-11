package com.eoe.oop.day02;

import java.util.Arrays;

import com.eoe.oop.day01.Person;

public class Student extends Person {
public String inSchool;
public String inClass;
//重写，复写，覆盖Person.say()
@Override
	public void say() {
		super.say();
		System.out.println("我在"+inSchool+inClass+"学习");
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, char sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, char sex, int age, double height, String type) {
		super(name, sex, age, height, type);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
public void swap(int[] a,int i,int j){
	int c=a[i];
	a[i]=a[j];
	a[j]=c;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Student();
Student s1=new Student("王菲", '女', 27, 1.85, "活泼的", "eoe极客学院", "1205班");
s1.say();
System.out.println(s1.name);
s1.feeling("我找到好工作了", "嘿嘿....");
System.out.println("我给大家演示两个变量交换的例子");
int[] a={10,100};
System.out.println(Arrays.toString(a));
s1.swap(a, 0, 1);
System.out.println("变");
System.out.println(Arrays.toString(a));
	}

	@Override
	public String toString() {
		return "Student [inSchool=" + inSchool + ", inClass=" + inClass
				+ ", name=" + name + ", sex=" + sex + ", age=" + age
				+ ", height=" + height + ", type=" + type + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
