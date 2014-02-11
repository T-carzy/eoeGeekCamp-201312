package com.eoe.oop.day03.entity;

public class Teacher extends Person{
	private String inSchool;
	private String worker;
	public String getInSchool() {
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
	/**
	 * @param inSchool
	 * @param worker
	 */
	
	@Override
	public void say() {
		super.say();
		System.out.println("俺在"+inSchool+"任"+this.worker);
	}
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param worker
	 */
	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
	}
	@Override
	public void doing() {
		System.out.println(this.name+"在备课...");
	}
	
}
