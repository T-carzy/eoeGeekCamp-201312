package com.eoe.oop.day01;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person.main(null);
		//Person.say();
		Person p1=new Person();
//		p1.name="��ΰ";
//		p1.sex='��';
//		p1.age=22;
//		p1.height=1.8;
//		p1.type="���ŵ�";
		p1.say();
		p1.feeling("���ҵ��ù�����", "����...");
	}

}
