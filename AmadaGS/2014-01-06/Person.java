package com.eoe.oop.Day01;

public class Person {

	/**
	 * @param args
	 */
	//�����˶���ĳ�Ա����
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	//�����˶���ķ���
	public void say(){
		System.out.println("����"+name+",����"+age+
				",���"+height+",���Ǹ�"+type+"��"+sex+"ʿ");
	}
	//�������ķ���
	public void feeling(String cause, String content){
		System.out.println(cause+" "+content);
		//System.out.println(content);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����˵�һ������
		Person p1=new Person();
		p1.name="��ɺ";
		p1.age=24;
		p1.height=1.67;
		p1.sex='Ů';
		p1.type="����";
		p1.say();
		p1.feeling("���������������ܸ���", "��������");
		
		//�����˵ڶ�������
	    p1=new Person();
	    p1.name="����";
	    p1.age=23;
	    p1.sex='��';
	    p1.type="��ɧ";
	    p1.height=1.78;
	    p1.say();
	    p1.feeling("�ҿ��Ե���100��", "�ٺ١���������");	
	}

}
