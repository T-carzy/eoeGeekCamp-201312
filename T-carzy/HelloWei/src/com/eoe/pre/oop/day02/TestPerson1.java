package com.eoe.pre.oop.day02;

import com.eoe.pre.oop.day01.Person1;



public class TestPerson1 {

	
	public static void main(String[] args) {
		Person1 p1=new Person1("奥特曼",'女',22,2.22,"变态的");
		p1.say();
		Person1 p2=new Person1("黑猫警长",'男',11,1.11,"彪悍的");
		p2.say();
		if(p1.equals(p2)){
			System.out.println("我们是同一个人");
		}else{
			System.out.println("我们不是同一个人");
		}
	}

}
