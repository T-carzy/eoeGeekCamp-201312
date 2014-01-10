package com.eoe.oop.day02;

import java.util.Arrays;

import com.eoe.oop.day01.Person;
import com.eoe.oop.day01.Work01;

public class Teacher extends Person {
public String inSchool;
public String worker;
//重写,复写，覆盖person.say()
@Override
	public void say() {
		System.out.println("我在"+inSchool+"任教");
		super.say();
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, char sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, char sex, int age, double height, String type) {
		super(name, sex, age, height, type);
		// TODO Auto-generated constructor stub
	}
	

	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
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
Teacher teacher=new Teacher();
teacher.inSchool="eoe极客学院";
teacher.say();
Teacher teacher2=new Teacher("刘亦菲", '女', 18, 1.75, "顽皮的", "36ke", "老师");
teacher2.say();
System.out.println("我给大家演示一个东东");
int[] a={5000,1000};
System.out.println(Arrays.toString(a));
System.out.println("变");
teacher2.swap(a, 0, 1);
System.out.println(Arrays.toString(a));
	}

}
