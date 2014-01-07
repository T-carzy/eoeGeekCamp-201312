package com.eoe.oop.day01;

import java.util.Arrays;

public class Student {

	/**
	 * ������ѧ���������Ϣ�г�ȡ�����Ժͷ���,��װ��Student��
	 * @param args
	 */
	
	//�����������
	String name;
	char sex;
	int age;
	double height;
	String type;
	String inSchool;
	String inClass;
	
	//�����������
	public Student(String name,int age,double height,String type,
			char sex,String inSchool,String inClass){
		this.name=name;
		this.age=age;
		this.height=height;
		this.sex=sex;
		this.type=type;
		this.inClass=inClass;
		this.inSchool=inSchool;
	}
	

	//����һ��say������ʾҪ˵�Ļ�
	public void say(){
		System.out.println("�ˣ���Һã�����"+name+",����"
				+age+"��,���"+height+"��,����һ��"
				+type+sex+"ʿ");
		System.out.println("����"+inSchool+inClass+"ѧϰ");
		System.out.println("������ұ������������ཻ�����㷨");				
	}
	
	//����һ��feeling����������
	public void feeling(){
		System.out.println("���ҵ��ù�����!,����8k");
		System.out.println("����...");
	}
	
	//����һ�����������ķ���
	public void swap(int[] a,int i,int j){
		int c=a[j];
		a[j]=a[i];
		a[j]=c;	
	}
	
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
		Student student2 = new Student("���ķ�",25,1.7,"���ŵ�",'��',
				"eoe����ѧԺ","Android1205��");
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
