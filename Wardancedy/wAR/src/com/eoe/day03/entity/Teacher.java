package com.eoe.day03.entity;

public class Teacher extends Person {
	protected String inSchool;
	protected String worker;
	public String getInSchool(){
		return inSchool;
	}
	public void setInSchool(String inSchool) {
		this.inSchool = inSchool;
	}
	public String getWorker() {
		return worker;
	}
public void setWorker(String worker) {
	this.worker = worker;
}
public Teacher() {
	// TODO Auto-generated constructor stub
}
@Override
public void say() {
	// TODO Auto-generated method stub
	super.say();
	System.out.println("我在"+inSchool+"任"+this.worker);
}
public Teacher(String name, char sex, int age, double height, String type,
		String inSchool, String worker) {
	super(name, sex, age, height, type);
	this.inSchool = inSchool;
	this.worker = worker;
}
@Override
public void doing() {
	// TODO Auto-generated method stub
	System.out.println(this.name+"在备课....");
}
}
