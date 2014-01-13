package com.eoe.oop.day03.entity;

public abstract class Person_ {

	/**
	 * ������ʾ��
	 * 
	 * @param args
	 */
	protected int id;
	protected String name;
	protected char sex;
	protected int age;
	protected double height;
	protected String type;

	public Person_() {
		super();
	}

	public Person_(int id, String name, char sex, int age, double height,
			String type) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}

	// name��ֵ
	public String getName (){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// sex��ֵ�ж�
	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == '��' || sex == 'Ů') {
			this.sex = sex;
		} else {
			this.sex = 'Ů';
		}
	}

	// age��ֵ�ж�
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 200) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}

	// hegiht��ֵ�ж�
	public double getHeghit() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0 && height < 3) {
			this.height = height;
		} else {
			this.height = 1.8;
		}
	}

	// type��ֵ
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	//���󷽷�
	public abstract void doing();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
