package com.eoe.oop.day01;

import java.util.Arrays;

public class Test02 {

	/**
	 * ����Student��
	 * @param args
	 */
	public static void main(String[] args) {
		//��һ��ѧԱ
				Student student1 = new Student("���ķ�",25,1.7,"���ŵ�",'��',
						"eoe����ѧԺ","Android1205��");
				student1.say();
				int[] a1={10,5};
				System.out.println(Arrays.toString(a1));
				student1.swap(a1,0,1);
				System.out.println("��");
				System.out.println(Arrays.toString(a1));
				student1.feeling();
				
				
				//�ڶ���ѧԱ
				Student student2 = new Student();
				student2.name="��ɺ";
				student2.sex='Ů';
				student2.height=1.69;
				student2.age=24;
				student2.type="���õ�";
				student2.inSchool="eoe����ѧԺ";
				student2.inClass="Android1205��";
				student2.say();
				int[] a2={100,1000};
				System.out.println(Arrays.toString(a2));
				student2.swap(a2,0,1);
				System.out.println("��");
				System.out.println(Arrays.toString(a2));
				student2.feeling();

	}

}
