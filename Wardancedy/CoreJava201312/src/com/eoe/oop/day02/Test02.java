package com.eoe.oop.day02;

import com.eoe.oop.day02.entity.Person;
import com.eoe.oop.day02.entity.Student;

public class Test02 {
	/**
	 * ����������֮�������ת��
	 */
	public static void main(String[] args) {
		Student student=new Student();
		//��������ñ����ܸ�ֵ����������ñ����������Զ�ת��Ϊ������
		Person person=student;
		student=(Student) person;
	}
}
