package com.eoe.pre.oop.day02;

import com.eoe.pre.oop.day01.Person1;

public class Son {


	public static void main(String[] args) {
			Person1 p=new Teacher();
			if(p instanceof Student){
			Student s=(Student) p;
			s.say();
			}else{
				System.out.println("类型不匹配");
			}
	}

}
