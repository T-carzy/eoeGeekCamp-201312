package com.eoe.Oop.exercise;

public class Teacher {
	public static  int count;
	String name;
	char sex;
	int age;
	double height;
	String dep;
	String course;
	
	public Teacher(String name, char sex, int age, double height, String dep,
			String course) {
		count++;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.dep = dep;
		this.course = course;
	}
	public void introduce(){
		System.out.println("�������ǵ�"+name+" ��ʦ������"
		+age+" �Ա�"+sex+" ����"+dep+"��"+course);
	}
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	
	public void swap(int[] a,int i,int j){
		a[i]+=a[j];
		a[j]=a[i]-a[j];
		a[i]-=a[j];
	}
	public Teacher(String name, int age, String dep, String course) {
		count++;
		this.name = name;
		this.age = age;
		this.dep = dep;
		this.course = course;
	}
}
