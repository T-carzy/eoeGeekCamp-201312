package com.eoe.oop.day03.entity;

public class Person {

	/**
	 * @param args
	 */
	//����������еı���
	protected String name;
	protected char sex;
	protected int age;
	protected double height;
	protected String type;
//name��ֵ
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
//sex��ֵ�ж�
	public char getSex(){
		return sex;
	}
	public void setSex(char sex){
		if (sex=='��'||sex=='Ů') {
			this.sex=sex;
		}else {
			this.sex='Ů';
		}
	}
//age��ֵ�ж�
	public int getAge(){
		return  age;
	}
	public void setAge(int age){
		if (age>0&&age<200) {
			this.age=age;
		}
		else {
			this.age=18;
		}
	}
//hegiht��ֵ�ж�
	public double getHeghit(){
		return  height;
	}
	public void setHeight(double height){
		if (height>0&&height<3) {
			this.height=height;
		}
		else {
			this.height=1.8;
		}
	}
//type��ֵ
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	

	// ˵�������к�,say�����ǷǾ�̬����
	public void say() {
		System.out.println("�ˣ���Һã�����" + name + "������" + age + "��,���" + height
				+ "��,����һ��" + type + sex + "ʿ");
	}

	// feeling�����ǷǾ�̬����
	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// �޲ι���(��)����,JVMĬ���ṩһ�����췽��
//	public Person() {
//		name = "����";
//		sex = '��';
//		age = 18;
//		height = 1.7;
//		type = "���õ�";
//	}
	

//���ι��췽��
	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}


	public Person() {
		super();
	}
	//��дtoString
	@Override
	public String toString() {
		return this.name;//��������
	}
//��дequals
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {               //objΪ��,�򷵻�false
			return false;
		}
		Person other=null;
		if (obj instanceof Person) {   //�ж��ܷ�ת��
			other=(Person) obj;        //ǿ��ת������ֵ��other
		}else {
			return false;
		}if (obj==this) {          		//obj�ĵ�ַ���������ĵ�ַ���,
			return true;
		}
		return this.name.equals(other.name)    //���ز��Ƚ�
				&&this.sex==other.sex&&
				this.age==other.age&&
				((Math.abs(this.height-other.height))<0.0000001)&&
				this.type.equals(other.type);
	}
	public void doing(){
	}

	public static void main(String[] args) {

	}

}
