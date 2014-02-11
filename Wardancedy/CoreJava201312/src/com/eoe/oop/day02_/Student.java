package com.eoe.oop.day02_;

import java.util.Arrays;
import com.eoe.oop.day01.Person;

public class Student extends Person {
	public String inSchool;
	public String inClass;
	
	//重写、覆写、覆盖Person.say()
	@Override
	public void say() {
		super.say();
		System.out.println("俺在"+inSchool+inClass+"学习");
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param inClass
	 */
	public Student(String name, char sex, int age, 
			double height, String type,
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
	public static void main(String[] args) {
		new Student();
		Student s1=new Student("张小飞", '男', 22, 1.79,
				"豪放的", "eoe极客学院", "1205班");
		s1.say();
		System.out.println(s1.name);
		s1.feeling("俺找到好工作啦", "哈哈");
		System.out.println("俺给大家表演两个变量值互换的算法");
		int[] aa={10,100};
		System.out.println(Arrays.toString(aa));
		s1.swap(aa, 0, 1);
		System.out.println("变:"+Arrays.toString(aa));
	}
}
