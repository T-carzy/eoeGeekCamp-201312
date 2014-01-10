package com.eoe.oop.day02;

public class Person {

	/**
	 * @param args
	 */
	//����������еı���
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;

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

	public static void main(String[] args) {
		Person p1=new Person("�ŷ�",'��',21,1.84,"���ŵ�");
		Person p2=new Person("�ŷ�",'��',21,1.85,"���ŵ�");
		if (p1.equals(p2)) {       //�Ƚ�p1 �� p2 �������Ƿ���ȫ���
			System.out.println("��һ����!");
		}else{
			System.out.println("����һ����!");
		}
	}

}
