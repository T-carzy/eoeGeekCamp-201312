package com.eoe.se1.day01;
import com.eoe.oop.day3.Person;
import com.eoe.oop.day3.Student;
import com.eoe.oop.day3.Teacher;


public class Test04 {
	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Student("��ɺ", 'Ů', 23, 1.65, "���ʵ�", "eoe����ѵ��Ӫ", "1205��");
		people[1]=new Teacher("�ŷ�", '��', 33, 1.76, "�����", "eoe����ѵ��Ӫ", "1205��");
		people[2]=new Student("����", 'Ů', 23, 1.65, "���ʵ�", "eoe����ѵ��Ӫ", "1205��");
		people[3]=new Person("�ŷ�", '��', 63, 1.76, "�����") {
			String unit="����Ϸ��ѧԺ";
			String worker="��Ա";
			@Override
			public void say() {
				super.say();
				System.out.println("����"+this.unit+"��"+this.worker);
			}
			@Override
			public void doing() {
				System.out.println(this.name+"��Ϸ����");
			}
		};
		for(Person p:people){
			p.say();
			p.doing();
			System.out.println();
		}
	}
}
