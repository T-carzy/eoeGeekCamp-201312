package com.eoe.oop.day02;

import com.eoe.oop.day01.Person;

public class Code01 {

	public Code01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//父类的引用变量可以存放，操作子类对象
		Person p=new Teacher();
		if(p instanceof Student){
			Student student=(Student)p;
			student.say();
		}else{
			System.out.println("类型不匹配");
		}

	}

}
