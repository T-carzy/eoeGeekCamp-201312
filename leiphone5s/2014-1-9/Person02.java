package com.fengleiit.swf;

public class Person02 {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public void say(){
		System.out.println("�ҽ�"+name+"����һλ"+"�ҽ���"+age+"�꣬"+"�����"+height+"��"+"��һλ�Ը�"+type+"��"+sex+"ʿ");
	}
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	public Person02(){
		name="����";
		sex='��';
		age=22;
		height=1.8;
		type="���õ�";
	}
	public Person02(String name){
		this();
		this.name=name;
	}
	public Person02(String name,String type){
		this(name);
		this.type=type;
	}
	public Person02(String name,String type,int age){
		this(name,type);
		this.age=age;
	}
	public Person02(String name,String type,int age,double height){
		this(name,type,age);
		this.height=height;
	}
	public Person02(String name,String type,int age,double height,char sex){
		this(name,type,age,height);
		this.sex=sex;
	}
	@Override
	public String toString() {
		
		return "����:"+this.name+" ����:"+this.age;
	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		Person02 other=null;
		if(obj instanceof Person02){
			other=(Person02) obj;
		}else{
			return false;
		}
		if(obj==this){
			return true;
		}
		return this.name.equals(other.name)&&this.sex==other.sex&&
				this.age==other.age&&this.height==other.height;
	}
	public static void main(String[] args) {
	Person02 p3=new Person02();
		p3.name="����";
		p3.type="��ŵ�";
		p3.age=18;
		p3.height=11.6;
		p3.say();
		p3.feeling("��Ǯ��", "�õĺܣ�");
		System.out.println(p3);
	}
}
