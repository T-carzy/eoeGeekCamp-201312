package com.eoe.oop.Day01;

public class Person1 {

	/**
	 * @param args
	 */
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	
	public void say(){
		System.out.println("我叫"+name+",今年"+
	             age+ ",身高"+height+",我是一个"+
				      type+"的"+sex+"士");
	}
	
	
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	
	
	
	public Person1(){
		name="高珊";
		sex='女';
		age=23;
		height=1.67;
		type="活潑";
		
	}
	
	public Person1(String name){
		this();
		this.name=name;
		
	}
	public Person1(String name,char sex){
		this(name);
		this.sex=sex;
	}
	public Person1(String name,char sex,int age){
		this(name,sex);
		this.age=age;
	}
	public Person1(String name,char sex,int age,double height){
		this(name,sex,age);
		this.height=height;
	}
	public Person1(String name,char sex,int age,double height,String type){
		this(name,sex,age,height);
		this.type=type;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p=new Person1();
		Person1 p1=new Person1("张三");
		Person1 p2=new Person1("李四",'男');
		Person1 p3=new Person1("王五",'女',28);
		Person1 p4=new Person1("赵六",'男',24,1.89);
		Person1 p5=new Person1("孟佳",'女',21,1.56,"可爱的");
		
		p.say();
		p1.say();
		p2.say();
		p3.say();
		p4.say();
		p5.say();
	}

}
