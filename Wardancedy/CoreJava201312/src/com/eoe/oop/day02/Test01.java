package com.eoe.oop.day02;

import java.util.Arrays;

import com.eoe.oop.day02.entity.Student;

public class Test01 {
	/**
	 * ��������Student���ʹ��
	 */
	public static void main(String[] args) {
		Student student=new Student("��С��", '��', 23, 1.89, "�����", "�������ڲ���ѧԺ", "TCSD1212��");
		student.say();//���ҽ���
		student.feeling("���ҵ��ù�����!", "(*^__^*)");
		//������������ֵ
		int[] a={5,10};
		System.out.println(Arrays.toString(a));
		student.swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}
}
