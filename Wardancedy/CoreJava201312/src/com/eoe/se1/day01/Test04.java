package com.eoe.se1.day01;

import com.eoe.oop.day03.entity.Person;
import com.eoe.oop.day03.entity.Student;
import com.eoe.oop.day03.entity.Teacher;

public class Test04 {
	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Student("��С��", '��', 23, 1.79, "���ŵ�", "eoe����ѵ��Ӫ", "eoe1205��");
		people[1]=new Teacher("�Ŵ��", '��', 33, 1.89, "��Ұ��", "eoe����ѵ��Ӫ", "��ʦ");
		people[2]=new Student("��С��", 'Ů', 23, 1.69, "�����", "eoe����ѵ��Ӫ", "eoe1205��");
		//�������һ������Ķ���
		people[3]=new Person("�����",'Ů',28,1.7,"�ľ���") {
			String unit="����Ϸ��ѧԺ";
			String worker="��Ӱ��Ա";
			@Override
			public void doing() {
				System.out.println(this.name+"������Ϸ");
			}
			@Override
			public void say() {
				super.say();
				System.out.println("����"+unit+"��"+worker);
			}
		};
		for(Person p:people){
			p.say();
			p.doing();
			System.out.println("****************");
		}
	}
}
