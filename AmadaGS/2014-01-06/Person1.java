package com.eoe.oop.Day01;

public class Person1 {

	/**
	 * @param args
	 */
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	
	public void say(){
		System.out.println("�ҽ�"+name+",����"+
	             age+ ",���"+height+",����һ��"+
				      type+"��"+sex+"ʿ");
	}
	
	
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	
	
	
	public Person1(){
		name="��ɺ";
		sex='Ů';
		age=23;
		height=1.67;
		type="�";
		
	}
	
	public Person1(String name){
		this();
		this.name=name;
		
	}
	public Person1(String name,char sex){
		this(name);
		this.sex=sex;
	}
	public Person1(String name,char sex,int age){
		this(name,sex);
		this.age=age;
	}
	public Person1(String name,char sex,int age,double height){
		this(name,sex,age);
		this.height=height;
	}
	public Person1(String name,char sex,int age,double height,String type){
		this(name,sex,age,height);
		this.type=type;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p=new Person1();
		Person1 p1=new Person1("����");
		Person1 p2=new Person1("����",'��');
		Person1 p3=new Person1("����",'Ů',28);
		Person1 p4=new Person1("����",'��',24,1.89);
		Person1 p5=new Person1("�ϼ�",'Ů',21,1.56,"�ɰ���");
		
		p.say();
		p1.say();
		p2.say();
		p3.say();
		p4.say();
		p5.say();
	}

}
