package com.eoe.oop.day03.entity;

public class Teacher extends Person {

	/**
	 * @param args
	 */
	private String inSchool;
	private String inWork;
	
	public String getInSchool(){
		return inSchool;
	}
	public void setInSchool(String inSchool){
		this.inSchool=inSchool;
	}
	
	public String getInWork(){
		return inWork;
	}
	public void setInWork(String inWork){
		this.inWork=inWork;
	}
	
	public Teacher() {
		super();
	}


	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String inWork) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inWork = inWork;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("����"+inSchool+" "+inWork+"�ν�");
	}
	
	public void doing(){
		System.out.println(this.name+"����������ҵ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
