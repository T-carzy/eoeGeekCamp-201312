package com.eoe.oop.day02;

public class Person {
	static int count;//计数：Person对象创建的次数
	//对象的成员变量
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	//说话，打招呼,say方法是非静态方法
	public void say(){
		System.out.println("嗨，大家好，俺叫"+
			name+"，今年"+age+"岁,身高"+height+
			"米,俺是一个"+type+sex+"士");
	}
	//feeling方法是非静态方法
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	//无参构造(器)方法,JVM默认提供一个构造方法
	public Person(){
		count++;
		name="张三";
		sex='男';
		age=18;
		height=1.7;
		type="活泼的";
	}
	public Person(String name){
		//this();//调用Person()
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
		return this.name;//返回人名
	}
	//重写、覆写Object类的equals()
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		Person other=null;
//		instanceof：判断obj是不是在Person里
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
		Person p=new Person("张飞",'女');
		p.say();
		//Person p2=new Person();
		//System.out.println(p2.count);
	}


}
