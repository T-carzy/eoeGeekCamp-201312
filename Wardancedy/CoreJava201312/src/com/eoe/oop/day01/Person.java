package com.eoe.oop.day01;

public class Person {
	//����ĳ�Ա����
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	//˵�������к�,say�����ǷǾ�̬����
	public void say(){
		System.out.println("�ˣ���Һã�����"+
			name+"������"+age+"��,���"+height+
			"��,����һ��"+type+sex+"ʿ");
	}
	//feeling�����ǷǾ�̬����
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	//�޲ι���(��)����,JVMĬ���ṩһ�����췽��
	public Person(){
		name="����";
		sex='��';
		age=18;
		height=1.7;
		type="���õ�";
	}
	public Person(String name){
		//this();//����Person()
		this.name=name;
	}
	public Person(String name,char sex){
		this(name);
		this.sex=sex;
	}
	public static void main(String[] args) {
		//JVM gc
//		Person p1=new Person();
//		p1.name="��ΰ";
//		p1.sex='��';
//		p1.age=22;
//		p1.height=1.8;
//		p1.type="���ŵ�";
//		p1.say();
//		p1.feeling("���ҵ��ù���������н8k", "����....");
//		p1.feeling("��ʧ����!","����....");
//		
//		p1=new Person();
//		p1.name="���ķ�";
//		p1.sex='��';
//		p1.age=25;
//		p1.height=1.7;
//		p1.type="�����";
//		p1.say();
//		p1.feeling("�����������", "����...");
//		p1.feeling("������ƭ�������", "����...");
//		Person p=new Person();
//		p.say();
		Person p=new Person("�ŷ�",'Ů');
		p.say();
		Person p2=new Person();
	}
}
