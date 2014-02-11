package com.eoe.oop.day02.entity;

import com.eoe.oop.day02.entity.Person;

public class Student extends Person {
	public String inSchool;//����ѧУ
	public String inClass;//���ڰ༶
	//�޲ι��췽��
	public Student(){
		
	}
	//���ι��췽��
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		//���ø���Ĵ��ι��췽������ʼ��name,sex,age,height��type����
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	//��д�����say() 
	@Override
	public void say() {
		super.say();//���ø����say()
		System.out.println("����"+inSchool+inClass+"ѧϰ");
	}
	//���Ӹ�����û�еķ�����ʵ����������ֵ����
	public void swap(int[] a,int i,int j){
		int c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	@Override
	public String toString() {
		return "����:"+this.name
			  +"  ����ѧУ:"+inSchool
			  +"  ���ڰ༶:"+inClass;
	}
	@Override
	public boolean equals(Object obj) {
		Student other=null;
		if(obj==null){
			return false;
		}
		if(obj instanceof Student){
			other=(Student) obj;
		}else{
			return false;
		}
		if(other==this){
			return true;
		}
		return super.equals(other)
			  &&this.inSchool.equals(other.inSchool)
			  &&this.inClass.equals(other.inClass);
	}
	public static void main(String[] args) {
		Student stu1=new Student("��С��", '��', 23, 1.79, "���ŵ�", "���ڲ���ѧԺ", "TCSD1209��");
		Student stu2=new Student("��С��", '��', 23, 1.79, "���ŵ�", "���ڲ���ѧԺ", "TCSD1209��");
		System.out.println("stu1:"+stu1);
		System.out.println("stu2:"+stu2);
		System.out.println("stu1==stu2:"+(stu1==stu2));
		System.out.println("stu1��stu2��һ����:"+(stu1.equals(stu2)));
	}
}
