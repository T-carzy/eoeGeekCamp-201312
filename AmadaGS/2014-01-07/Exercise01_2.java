package com.eoe.Oop.exercise;

import java.util.Arrays;

public class Exercise01_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher("������",'��',34,1.87,
				"����ѧԺ","����");
		t.introduce();
		t.feeling("���ǰ��˶�Ա���Ե���һ�Ƚ�", "��������");
		System.out.println("�Ҹ����Ǳ��ݱ���");
		int[] a={23,45};
		System.out.println("a[0]="+a[0]+" a[1]="+a[1]);
		t.swap(a, 0, 1);
		System.out.println("��");
		System.out.println("a[0]="+a[0]+" a[1]="+a[1]);
		//2
		Teacher tea=new Teacher("����",'Ů',32,1.58,"����","Ӣ��");
		tea.introduce();
		tea.feeling("���н���", "�Һܿ��ģ�");
		System.out.println("���ǵ�"+Teacher.count+"�����ˣ�");
	}
}
