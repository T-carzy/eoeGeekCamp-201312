package com.eoe.oop.day03.entity;

public class Polymorphic {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		//����һ������,Person��
		Person[] people=new Person[4];
		people[0]=new Student("��С��",'��',23,1.78,"��ŵ�",
				"eoe����ѵ��Ӫ","1205"); 
		people[1]=new Teacher("����",'Ů',28,1.68,"�����",
				"eoe����ѵ��Ӫ","1205");
		people[2]=new Student("��ΰ",'��',17,1.98,"����",
				"eoe����ѵ��Ӫ","1205");
		people[3]=new Teacher("���ķ�",'��',55,1.68,"������",
				"eoe����ѵ��Ӫ","1205");
		for (int i = 0; i < people.length; i++) {
			people[i].say();
			people[i].doing();

		}
	}

}
