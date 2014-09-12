package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;

public class Test01 {
	public static void main(String[] args) {
		//父类的引用变量可以存放、操作子类对象
		Person p=new Teacher();
		if(p instanceof Student){
			Student s=(Student) p;
			s.say();
		}else{
			System.out.println("类型不匹配");
		}
	}
}
