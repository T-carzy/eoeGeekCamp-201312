package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;

public class Test01 {
	public static void main(String[] args) {
		//��������ñ������Դ�š������������
		Person p=new Teacher();
		if(p instanceof Student){
			Student s=(Student) p;
			s.say();
		}else{
			System.out.println("���Ͳ�ƥ��");
		}
	}
}
