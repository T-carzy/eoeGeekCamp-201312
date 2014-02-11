package com.eoe.oop.day02.entity;

import com.eoe.oop.day02.entity.Person;

public class Teacher extends Person {
	public String inSchool;//����ѧУ
	public String worker;//ְ��
	public Teacher(){
		
	}
	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
	}
	@Override
	public void say() {
		super.say();
		System.out.println("����"+inSchool+"��"+worker);
	}
	public void swap(int [] a,int i,int j){
		a[i]+=a[j];
		a[j]=a[i]-a[j];
		a[i]-=a[j];
	}
	@Override
	public String toString() {
		return "����:"+this.name+" ְ��:"+this.worker;
	}
	
	@Override
	public boolean equals(Object obj) {
		Teacher t=(Teacher) obj;
		return this.name.equals(t.name)&&
			   this.sex==t.sex&&
			   this.age==t.age&&
			   this.height-t.height<0.01&&
			   this.type.equals(t.type)&&
			   this.inSchool.equals(t.inSchool)&&
			   this.worker.equals(t.worker);
	}
}
