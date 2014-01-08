package com.eoe.oop.day01;

public class Person {
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
	public static void main(String[] args) {
		//JVM gc
//		Person p1=new Person();
//		p1.name="李伟";
//		p1.sex='男';
//		p1.age=22;
//		p1.height=1.8;
//		p1.type="豪放的";
//		p1.say();
//		p1.feeling("俺找到好工作啦，月薪8k", "哈哈....");
//		p1.feeling("俺失恋啦!","哇哇....");
//		
//		p1=new Person();
//		p1.name="梁文峰";
//		p1.sex='男';
//		p1.age=25;
//		p1.height=1.7;
//		p1.type="热情大方";
//		p1.say();
//		p1.feeling("俺捡了五百万", "嘻嘻...");
//		p1.feeling("俺被人骗了五百万", "呜呜...");
//		Person p=new Person();
//		p.say();
		Person p=new Person("张飞",'女');
		p.say();
		Person p2=new Person();
	}
}
