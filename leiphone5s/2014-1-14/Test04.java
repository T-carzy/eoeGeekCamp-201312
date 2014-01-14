package com.eoe.oop.se1.day01;

import com.eoe.oop.day03.entity.Person;
import com.eoe.oop.day03.entity.Student;
import com.eoe.oop.day03.entity.Teacher;


public class Test04 {
public static void main(String[] args) {
	Person[] people=new Person[4];//���ó�����
	people[0]=new Student("���",'��',22,1.8,"��ˬ��","eoeѧԺ","1205��");
	people[1]=new Teacher("����",'Ů',23,1.8,"��ţ��","eoeѧԺ","1205��");
	people[2]=new Student("����",'Ů',24,1.7,"Ư����","eoeѧԺ","1205��");
	people[3]=new Person("�ŷ�",'��',24,1.8,"��Ұ��") {
		String unit="����Ϸ��ѧԺ";
		String work="��Ա";
		@Override
		public void doing() {
			// TODO Auto-generated method stub
			System.out.println("������Ϸ...");
		}
		public void say(){
			super.say();
			System.out.println("����"+unit+"��"+work);
		}
	};
	for(Person p:people){
		p.say();
		p.doing();
		System.out.println("***********************");
	}
}
}
