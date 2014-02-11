package com.eoe.oop.test;

import com.eoe.day03.entity.Person;
import com.eoe.day03.entity.Student;
import com.eoe.day03.entity.Teacher;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p=new Person[4];
		p[0]=new Student("李伟",'男',22,1.89,"活泼的","eoe极客训练营","1205班");
		p[1]=new Teacher("韩伟",'男',33,1.60,"豪迈的","eoe极客训练营","1205班");
		p[2]=new Student("高珊",'女',23,1.90,"温柔的","eoe极客训练营","1205班");
		p[3]=new Teacher("冯蕾", '男', 22, 1.70, "稳重的", "eoe极客训练营", "1205班");
		for (int i = 0; i < p.length; i++) {
			p[i].say();
			p[i].doing();
			
		}

	}

}