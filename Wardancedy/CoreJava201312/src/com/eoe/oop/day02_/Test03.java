package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;

public class Test03 {
	public static void main(String[] args) {
		Person p1=new Person("张飞", '男',33, 1.99, "豪放的");
		//Enginner p2=new Enginner("张飞");
		Person p2=new Person("张飞", '男',33, 1.89, "豪放的");
		if(p1.equals(p2)){
			System.out.println("是一个人");
		}else{
			System.out.println("不是一个人");
		}
	}
}
