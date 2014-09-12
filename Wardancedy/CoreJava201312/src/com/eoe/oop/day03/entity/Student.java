package com.eoe.oop.day03.entity;

public class Student extends Person {
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
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	@Override
	public void doing() {
		System.out.println(this.name+"正在写作业呢...");
	}
	
}
