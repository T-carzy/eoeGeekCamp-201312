package com.eoe.oop.day02;

import com.eoe.oop.day02.entity.Person;
import com.eoe.oop.day02.entity.Student;
import com.eoe.oop.day02.entity.Teacher;

public class Test02_2 {
	/**
	 * instanceOfʾ��
	 */
	public static void main(String[] args) {
		//��������������������ת���쳣
		Person person=new Teacher();
		Student stu=(Student) person;		
		Person person2=new Student();
		//��instanceOf�ؼ���������ת��ʱ���������ж�
		if(person instanceof Student){
			Student student=(Student) person;
			System.out.println("person���õĶ�����Student����");
		}else{
			System.out.println("person���õĶ�����Student����");
		}
	}
}
