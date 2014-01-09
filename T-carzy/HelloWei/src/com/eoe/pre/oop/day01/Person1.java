package com.eoe.pre.oop.day01;

public class Person1 {
	protected static String name;
	public static int age;
	public static double height;
	public static char sex;
	public static String type;
	public void say(){
		System.out.println("大家好，我是"+name+"," +
				"今年"+age+"岁，身高"+height+"米，" +
						"我是一名"+type+sex+"士");
	
	}
	public void feeling(String s1,String s2){
		System.out.println(s1);
		System.out.println(s2);
	}
	public Person1(){
		name="大鲤鱼";
		age=22;
		height=2.22;
		sex='妖';
		type="暴躁的";
		
	}
//	public Person1(String name,int age,double height,String type,char sex){
//		this.name=name;
//		this.age=age;
//		this.height=height;
//		this.type=type;
//		this.sex=sex;
//	}
	public Person1(String name){
		this();
		this.name=name;
	}
	public Person1(String name,int age){
		this(name);
		this.age=age;
	}
	public Person1(String name,int age,double height){
		this(name,age);
		this.height=height;
	}
	public Person1(String name,int age,double height,String type){
		this(name,age,height);
		this.type=type;
	}
	public Person1(String name,int age,double height,String type,char sex){
		this(name,age,height,type);
		this.sex=sex;
	}
	public Person1(String name, char sex, int age, 
			double height, String type){
		this(name,age,height,type,sex);
	}
	
	public String toString(){
		return this.name;
	}
	public boolean equals(Object obj){
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
		return this.name.equals(other.name)&&this.sex==other.sex&&
		this.age==other.age&&this.height-other.height<0.01&&
		this.type.equals(other.type);
	}
	public static void main(String[] args) {
		Person1 p=new Person1("张飞",'女',22,2.22,"狂野的");
		p.say();
	}
	}


