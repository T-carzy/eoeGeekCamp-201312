package com.eoe.pre.oop.day01;

public class PersonTest {

	
	public static void main(String[] args) {
		Person p=new Person();
		p.say();
	}
	static Person createPerson(){
		Person person=new Person();
		return person;
	}

}
