package com.eoe.pre.day03;

public class Person {
	public String name;//����
	public char sex;//�Ա�
	public int age;
	public double height;
	public String type;//�Ը�
	//������ι���(��)����
	public Person(String name,char sex,int age,
		double height,String type){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.height=height;
		this.type=type;
	}
	//��������ͬ��������ͬ����Ϊ���������ء�
	public Person(){
		
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
		Person p1=new Person("�ŷ�",'��',33,1.99,"���ŵ�");
//		p1.name="�ŷ�";
//		p1.sex='��';
//		p1.age=33;
//		p1.height=1.99;
//		p1.type="���ŵ�";
		p1.say();
		p1.feeling("�����������", "����.....");
		
		Person p2=new Person();
		p2.name="����";
		p2.sex='Ů';
		p2.age=30;
		p2.height=1.69;
		p2.type="�����";
		p2.say();
		p2.feeling("������Ϊ�����!", "�ٺ�.....");
		
		p1=new Person();
		p1.name="�����";
		p1.sex='Ů';
		p1.age=28;
		p1.height=1.7;
		p1.type="�ľ���";
		p1.say();
		p1.feeling("������ΪӰ����", "�Ǻ�.....");
	}
}
