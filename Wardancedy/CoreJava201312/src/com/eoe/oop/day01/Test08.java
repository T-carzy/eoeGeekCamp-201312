package com.eoe.oop.day01;

public class Test08 {
	public static void main(String[] args) {
		Person person=createPerson();
		person.say();
	}
	//����������Person����
	static Person createPerson(){
		Person p=new Person();
		return p;
	}
}
