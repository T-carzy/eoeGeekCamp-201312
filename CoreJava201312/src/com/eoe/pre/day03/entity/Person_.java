package com.eoe.pre.day03.entity;

public abstract class Person_ {
	private String name;//����
	private char sex;//�Ա�
	private int age;
	private double height;
	private String type;//�Ը�
	
	//doing()��һ�����󷽷�
	public abstract void doing();
	
	//������
	public String getName(){
		return this.name;
	}
	//д����
	public void setName(String name){
		this.name=name;
	}
	public char getSex(){
		return this.sex;
		
	}
	public void setSex(char sex){
		if(sex=='��' || sex=='Ů'){
			this.sex=sex;
		}else{
			this.sex='��';
		}
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		if(age>=0 && age<=200){
			this.age=age;
		}else{
			this.age=18;
		}
	}
	//������ι���(��)����
	public Person_(String name,char sex,int age,
		double height,String type){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.height=height;
		this.type=type;
	}
	//��������ͬ��������ͬ����Ϊ���������ء�
	public Person_(){
		
	}
	//˵��
	public void say(){
		System.out.println("�ˣ���Һã�����"+
			name+",����"+age+"��,���"+height+
			"��,����һ��"+type+sex+"ʿ");
	}
	//������
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	public static void main(String[] args) {
		//Person_ p1=new Person_("�ŷ�",'��',33,1.99,"���ŵ�");
//		p1.name="�ŷ�";
//		p1.sex='��';
//		p1.age=33;
//		p1.height=1.99;
//		p1.type="���ŵ�";
		//p1.say();
		//p1.feeling("�����������", "����.....");
		
//		Person_ p2=new Person_();
//		p2.name="����";
//		p2.sex='Ů';
//		p2.age=30;
//		p2.height=1.69;
//		p2.type="�����";
//		p2.say();
//		p2.feeling("������Ϊ�����!", "�ٺ�.....");
		
//		p1=new Person_();
//		p1.name="�����";
//		p1.sex='Ů';
//		p1.age=28;
//		p1.height=1.7;
//		p1.type="�ľ���";
//		p1.say();
//		p1.feeling("������ΪӰ����", "�Ǻ�.....");
	}
}
