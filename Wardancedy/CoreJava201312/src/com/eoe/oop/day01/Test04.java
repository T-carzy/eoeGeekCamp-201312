package com.eoe.oop.day01;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("��С��", '��', 23, 1.89, "eoe����ѧԺ",
				"android1205��", "���ŵ�");
		s1.say();
		s1.feeling("��ʧ����", "����...");
		System.out.println("������ұ������������ཻ�����㷨");
		int[] aa={10,100};
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		s1.swap(aa, 0,1);
		System.out.println("��");
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		Student s2 = new Student("��С��", '��', 23, 1.89, "eoe����ѧԺ",
			"android1205��", "���ŵ�");
		s2.say();
		s2.feeling("��ʧ����", "����...");
		System.out.println("������ұ������������ཻ�����㷨");
		aa=new int[]{1000,10000};
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
		s2.swap(aa, 0,1);
		System.out.println("��");
		System.out.println("a=" + aa[0] + "  b=" + aa[1]);
	}

}
