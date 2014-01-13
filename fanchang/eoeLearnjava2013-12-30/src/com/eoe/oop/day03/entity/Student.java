package com.eoe.oop.day03.entity;

public class Student extends Person{

	/**
	 * @param args
	 */
	//������������
	private String inClass;
	private String inSchool;
	
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
		System.out.println("����"+inSchool+" "+inClass+"ѧϰ");
	}
	
	public void doing(){
		System.out.println(this.name+"����д��ҵ");
	}
	public Student(String name, char sex, int age, double height, String type,
			String inClass, String inSchool) {
		super(name, sex, age, height, type);
		this.inClass = inClass;
		this.inSchool = inSchool;
	}
	
	public Student() {
		super();
	}
	public static void main(String[] args) {

	}

}
