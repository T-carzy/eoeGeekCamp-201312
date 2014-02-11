package com.eoe.day03.entity;

public  class Student extends Person {
protected String inSchool;
protected String inClass;
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
@Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("我在"+inSchool+inClass+"学习");
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
@Override
	public void doing() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"正在写作业了....");
	}

}

