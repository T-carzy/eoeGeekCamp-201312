package com.eoe.pre.oop.day02;

import com.eoe.pre.oop.day01.Person;

public class Test03 {
	/**
	 * ����������֮�������ת��
	 */
	public static void main(String[] args) {
		Person student=new Student();
		//��������ñ����ܸ�ֵ����������ñ����������Զ�ת��Ϊ������
		Person person=student;
		student=(Student)person;
		
	}
}
