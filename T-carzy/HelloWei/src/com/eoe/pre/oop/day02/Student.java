package com.eoe.pre.oop.day02;
import java.util.Arrays;

import com.eoe.pre.oop.day01.Person1;

public class Student extends Person1{
		public String inSchool;
		public String inClass;
		@Override
		public void say() {
		super.say();
		System.out.println("我在"+inSchool+inClass+"读书");
		}
		public Student() {
		}
		
	public Student(String name, char sex, int age, double height,
				String type, String inSchool, String inClass) {
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
			Student s=new Student("凹凸曼",'女',22,22.2,"狂暴的","eoe极客学院","安卓1205班");
			s.say();
			System.out.println(s.name);
			s.feeling("我失恋了", "哈哈哈。。。");
			System.out.println("给大家展示先我学到的知识，关于两个变量相互交换");
			int a[]={1111,9999};
			System.out.println(Arrays.toString(a));
			s.swap(a, 1, 0);
			System.out.println("我了个去："+Arrays.toString(a));
	}

}
