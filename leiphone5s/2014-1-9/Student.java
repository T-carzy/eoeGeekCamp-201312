package com.fengleiit.wow;

import java.util.Arrays;

import com.fengleiit.swf.Person02;

public class Student extends Person02 {
	public String inSchool;
	public String inClass;
	public Student(){
		
	}
	public Student(String name,char sex,double height,int age,
			String type,String inSchool,String inClass){
		super(name, type, age, height, sex);
		this.inSchool=inSchool;
		this.inClass=inClass;	
	}
	public void swap(int[] a,int i,int j){
		int c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	public void swap(String[] b,int i,int j){
		String c=b[i];
		b[i]=b[j];
		b[j]=c;
	}
	@Override
	public void say(){
		super.say();
		System.out.println("����"+inSchool+inClass+"ѧϰ");
		
	}
	public static void main(String[] args) {
		Student s1=new Student("��С��",'��',1.8,22,
				"���ŵ�","eoe����ѧԺ","1205��");
		Student s2=new Student();
		s1.say();
		System.out.println(s1.name);
		s1.feeling("���ҵ��ù�����", "����");
		System.out.println("������ұ������������໥����");
		int[] aa={10,100};
		System.out.println(Arrays.toString(aa));
		System.out.println("�䣡����");
		s1.swap(aa, 0, 1);
		System.out.println(Arrays.toString(aa));
		String[] b={"aa","bb"};
		System.out.println(Arrays.toString(b));
	    s2.swap(b,0,1);
	    System.out.println(Arrays.toString(b));
	   
	}
}
