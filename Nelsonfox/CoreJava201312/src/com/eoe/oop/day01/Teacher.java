package com.eoe.oop.day01;

public class Teacher {
public String name;
public char sex;
public int age;
public double height;
public String type;
public String zhiyeString;
public void say(){
	System.out.println("大家好，我叫"+name+"今年"+age+"岁，身高"+height+"米，我是一个"+type+sex+zhiyeString);
}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
public Teacher(String name,char sex,int age,double height,String type, String zhiyeString){
	super();
	this.name=name;
	this.sex=sex;
	this.age=age;
	this.height=height;
	this.type=type;
	this.zhiyeString=zhiyeString;
}
}
