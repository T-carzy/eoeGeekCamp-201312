package com.eoe.pre.oop.day03.entity;

public class Student extends Person02 {
private String inSchool;
private String inClass;
public String getInSchool(){
	return inSchool;
}
public void setInSchool(String inSchool){
	this.inSchool=inSchool;
}
public String getInClass(){
	return inClass;
}
public void setInClass(String inClass){
	this.inClass=inClass;
}
public void say(){
	super.say();
	System.out.println("俺在"+inSchool+inClass+"上學");
}
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(String name, char sex, int age, double height, String type,
		String inSchool, String inClass) {
	super(name, sex, age, height, type);
	this.inSchool = inSchool;
	this.inClass = inClass;
}
public void doing(){
	System.out.println("我正在寫作業、、、");
}
}
