package com.eoe.oop.day01;

public class Student {

	/**
	 * ������ѧ���������Ϣ�г�ȡ�����Ժͷ���,��װ��Student��
	 * @param args
	 */
	
	//�����������
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public String inClass;
	//�޲ε�
	public Student() {
		super();
	}


	//����5�������ķ���
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
		
	}
}
