package com.eoe.oop.day03;

import com.eoe.oop.day03.entity.Person;
import com.eoe.oop.day03.entity.Student;
import com.eoe.oop.day03.entity.Teacher;

public class Test01 {
	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Student("��ΰ��", '��', 22, 1.89, "���õ�", "eoe����ѵ��Ӫ", "1205��");
		people[1]=new Teacher("�Ŵ��", '��', 33, 1.79, "���ŵ�", "eoe����ѵ��Ӫ", "��ʦ");
		people[2]=new Student("���ķ�", '��', 25, 1.29, "������", "eoe����ѵ��Ӫ", "1205��");
		people[3]=new Teacher("�����", 'Ů', 33, 1.79, "�ľ���", "eoe����ѵ��Ӫ", "������");
		for (int i = 0; i < people.length; i++) {
			people[i].say();
			people[i].doing();
		}
	}
	/*
	 * ���󷽷�������
	 * ���췽�� static
	 * ��̬������������Ϊ���󷽷�
	 * ˽�еķ�����������Ϊ���󷽷�
	 * final�����ķ�����������Ϊ���󷽷�
	 */
}
