package com.eoe.pre.day03;

import java.util.ArrayList;

import com.eoe.pre.day03.entity.Person_;
import com.eoe.pre.day03.entity.Student_;
import com.eoe.pre.day03.entity.Teacher_;

public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person_> people = new ArrayList<Person_>();
		people.add(new Student_("��С��", '��', 22, 1.79, "���ŵ�", "eoe",
				"eoe210312��"));
		people.add(new Teacher_("�Ŵ��", '��', 32, 1.79, "���ŵ�", "eoe", "��ʦ"));
		people.add(new Student_("��С��", 'Ů', 22, 1.79, "���ŵ�", "eoe",
				"eoe210312��"));
		people.add(new Person_("�����",'Ů',28,1.69,"�����") {

			@Override
			public void doing() {
				System.out.println(this.getName()+"���ڱ���....");
			}
		});
		
		for (Person_ p : people) {
			p.say();
			p.doing();
			System.out.println("*************");
		}
	}

}
