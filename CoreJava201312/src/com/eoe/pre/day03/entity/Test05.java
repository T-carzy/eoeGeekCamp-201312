package com.eoe.pre.day03.entity;

import com.eoe.pre.day03.Person;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Person p=new Student("��С��", '��', 23, 1.89, "���ֵ�", "eoe", "1312��");
//		p.say();
//		Person p2=new Teacher("�Ŵ��", '��', 33, 1.89, "���ֵ�", "eoe", "��ʦ");
//		p2.say();
		//����ļ���ԡ�һ���ԣ����ܵĶ����ԡ�
		Person[] people=new Person[4];
		people[0]=new Student("��С��", '��', 23, 1.89, "���ֵ�", "eoe", "1312��");
		people[1]=new Teacher("�Ŵ��", '��', 33, 1.89, "���ֵ�", "eoe", "��ʦ");
		people[2]=new Student("��С��", '��', 23, 1.89, "���ֵ�", "eoe", "1312��");
		people[3]=new Teacher("�����", '��', 33, 1.89, "���ֵ�", "eoe", "������");
		for(Person person:people){
			person.say();
		}
	}

}
