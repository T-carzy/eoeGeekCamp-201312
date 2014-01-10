package com.eoe.oop.day02;

import java.util.Arrays;

import com.eoe.oop.day01.Person;

public class Teacher extends Person {

	/**
	 * @param args
	 */
	public String inClass;
	public String inWork;
	//�޲ι��췽��,���ø�����޲ι��췽��
	public Teacher(String name, char sex, double height, String inClass,
			String inWork) {
		super(name, sex, height);
		this.inClass = inClass;
		this.inWork = inWork;
	}
	//����ֵ
	public void swap(int[] a, int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
	//˵���ķ���,�̳�Person say()
	public void say() {
		super.say();
		System.out.println("����" + inClass + inWork + "�ν�");
	}

	public static void main(String[] args) {
		Teacher t1 = new Teacher("����", '��', 1.78, "����ѧԺ", "eoeSchool");
		t1.age = 24;
		t1.type = "�Ͱ���";
		t1.say();
		t1.feeling("���ҵ��ù�����", "  ����");
		System.out.println("������ұ�����������ֵ�������㷨");
		int[] a = { 155, 100 };
		System.out.println(Arrays.toString(a));
		t1.swap(a, 0, 1);
		System.out.println("��" + Arrays.toString(a));
	}

}
