package com.eoe.oop.day01;

public class Test08 {
	public static void main(String[] args) {
		Person person=createPerson();
		person.say();
	}
	//创建并返回Person对象
	static Person createPerson(){
		Person p=new Person();
		return p;
	}
}
