package com.eoe.oop.day02_;

import java.util.Arrays;
import com.eoe.oop.day01.Person;

public class Teacher extends Person {
	public String inSchool;
	public String worker;
	
	//重写、覆写、覆盖Person.say()
	@Override
	public void say() {
		super.say();
		System.out.println("俺在"+inSchool+"任教");
	}
	public Teacher() {
		//super();//调用父类的无参构造方法
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
	public Teacher(String name, char sex, int age, 
			double height, String type,
			String inSchool, String inClass) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker=worker;
	}
	public void swap(int[] a,int i,int j){
		int c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	public static void main(String[] args) {
		Teacher t=new Teacher();
		
	}
}
