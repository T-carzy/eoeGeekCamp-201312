package com.eoe.oop.day03;

import com.eoe.oop.day03.entity.Student;
import com.eoe.oop.day03.entity.Person;
import com.eoe.oop.day03.entity.Teacher;

public class Test_people {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("�����");
		p1.setAge(300);
		p1.setSex('b');
		p1.setHeight(3.1);
		p1.setType("�����");
		p1.say();
		p1.feeling("���ҵ��ù�����","����!");
		
		Student s1=new Student("����",'Ů',21,1.75,"�����","����ѧԺ","1205");
		s1.say();
		s1.doing();
		
		Teacher t1=new Teacher("�ŷ�",'��',28,1.99,"�����","����ѧԺ","1205");
		t1.say();
		t1.doing();
		
	}

}
