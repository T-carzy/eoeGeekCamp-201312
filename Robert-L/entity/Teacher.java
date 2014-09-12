package com.eoe.pre.oop.day03.entity;

public class Teacher extends Person02 {
private String inSchool;
private String inClass;
public String getInClass() {
	return inClass;
}
public void setInClass(String inClass) {
	this.inClass = inClass;
}
public String getInSchool() {
	return inSchool;
}
public void setInSchool(String inSchool) {
	this.inSchool = inSchool;
}
@Override
	public void say() {
		super.say();
		System.out.println("我在"+inSchool+inClass+"任教");
	}
public Teacher() {
	// TODO Auto-generated constructor stub
}
public Teacher(String name, char sex, int age, double height, String type,
		String inSchool, String inClass) {
	super(name, sex, age, height, type);
	this.inSchool = inSchool;
	this.inClass = inClass;
}
public void doing(){
	System.out.println("我在教課呢。");
}
}
