package com.eoe.Oop;

import java.util.Arrays;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("�ŷ�", '��', 23, 1.80, "�����", "eoe����ѵ��Ӫ",
				"Android 1205��");
		s1.say();
		s1.feeling("�����������", "����������������");
		int[] a = { 23, 87 };
		System.out.println("�Ҹ���ұ��ħ��");
		System.out.println("a[0]=" + a[0] + " a[1]=" + a[1]);
		System.out.println("��");
		s1.swap(a, 0, 1);
		System.out.println("a[0]=" + a[0] + " a[1]=" + a[1]);
		// �ڶ�����
		Student s2 = new Student("�����", 'Ů', 23, 1.80, "�����", "eoe����ѵ��Ӫ",
				"Android 1205��");
		s2.say();
		System.out.println("����" + Student.count + "����");
	}
}
