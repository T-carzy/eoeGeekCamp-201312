package com.eoe.pre.oop.day02;

import com.eoe.pre.oop.day01.Person;

public class Teacher extends Person {
public String inSchool;
public String worker;
public Teacher() {
	// TODO Auto-generated constructor stub
}
@Override
	public void say() {
		super.say();
		System.out.println("����"+inSchool+worker+"����");
	}


}
