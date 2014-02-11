package com.eoe.oop.day01;

public class Person {
	static int count;//������Person���󴴽��Ĵ���
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
		count++;
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
	
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 */
	public Person(String name, char sex, int age, double height, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
	}
	@Override
	public String toString() {
		return this.name;//��������
	}
	//��д����дObject���equals()
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		Person other=null;
		if(obj instanceof Person){
			other=(Person) obj;
		}else{
			return false;
		}
		if(obj==this){
			return true;
		}
		return this.name.equals(other.name)&&this.sex==other.sex;
	}
	public static void main(String[] args) {
		Person p=new Person("�ŷ�",'Ů');
		p.say();
		//Person p2=new Person();
		//System.out.println(p2.count);
	}
}
