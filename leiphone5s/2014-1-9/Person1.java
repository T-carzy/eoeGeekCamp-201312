package com.fengleiit.wow;

public class Person1 {
	public static String strPerson = "���:��:33:1.67:���ֵ�";
	public static String strBook = "1:�����Java��:ISBN18005:85";
	String name;
	String sex;
	String age;
	String height;
	String type;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "����:"+name+"\n�Ա�:"+sex+"\n����:"+age+"\n���:"+height+"\n�Ը�:"+type;
}
	
	
public Person1(){
	name = strPerson.substring(0, strPerson.indexOf(":"));
	sex = strPerson.substring(3, 4);
	age = strPerson.substring(5, 7);
	height = strPerson.substring(8, strPerson.lastIndexOf(":"));
	type = strPerson.substring(strPerson.lastIndexOf(":") + 1);
}
public Person1(String name){
	this();
	this.name=name;
}
public Person1(String name,String age){
	this(name);
	this.age=age;	
}
public Person1(String name,String age,String height){
	this(name, age);
	this.height=height;	
}
public Person1(String name,String age,String height,String type){
	this(name, age, height);
	this.type=type;
}
public String details(){
	System.out.println("����:"+name+"\n�Ա�:"+sex+"\n����:"+age+"\n���:"+height+"\n�Ը�:"+type);
	return age;
}

public static void main(String[] args) {
	Person1 p=new Person1();
	System.out.println(p);
}
}
