package com.eoe.pre.oop.day02;
/**
 * Person���ʾ����
 * ��дObject.toString()
 * ��дObject.equals()
 */
public class Person {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	/**
	 * �Զ��幹�췽����
	 * 1��ΪPerson����ĸ���Ա�����ṩĬ��ֵ
	 * 2��ͳ��Person()�����õĴ���
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}
	public void say(){
		System.out.println("�ˣ���Һã����ҽ�"+name);
		System.out.println(",����"+age+"�꣬");
		System.out.println("����һ��"+type+sex+"ʿ");
	}
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	//��дObject.toString(),���ض����name����
	@Override
	public String toString() {
		return this.name;
	}
	/** ��дObject.equals()
	 * �ж����������Ƿ���һ���˵ı�׼��
	 * �������Ա����䡢��ߺ��Ը����
	 */
	@Override
	public boolean equals(Object obj) {
		Person other=null;
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Person){
			other=(Person) obj;
		}else{
			return false;
		}
		return this.name.equals(other.name)&&
			   this.sex==other.sex&&
			   this.age==other.age&&
			   this.height==other.height&&
			   this.type.equals(other.type);
	}
	/**
	 * ������
	 */
	public static void main(String[] args) {
		//������һ����
		Person p1=new Person("��С��",'��',23,1.89,"�����");
		System.out.println(p1);
		//�����ڶ�����
		Person p2=new Person("��С��",'��',23,1.79,"�����");
		System.out.println(p2);
		if(p1.equals(p2)){
			System.out.println("һ����");
		}else{
			System.out.println("��ͬһ����");
		}
	}
}
