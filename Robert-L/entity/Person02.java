package com.eoe.pre.oop.day03.entity;
public abstract class Person02 {
	//对象的成员变量
protected String name;
protected char sex;
protected int age;	
protected double height;
protected String type;
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public char getSex(){
	return sex;
}
public void setSex(char sex){
	if(sex=='男'||sex=='女'){
		this.sex=sex;
	}else{
		this.sex='男';
		
	}
}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age>=1&&age<=200){
			this.age=age;
		}else{
			this.age=20;
		}
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		if(height>=0&&height<=4){
			this.height=height;
		}else{
			this.height=1.6;
		}
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
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

	public Person02(){
		this.name="张三";
		sex='男';
		age=18;
		height=1.7;
		type="活泼的";
	}
	public Person02(String name){
		this();//调用Person()
		this.name=name;
	}
	public Person02(String name,char sex){
		this(name);
		this.sex=sex;
	}
	public Person02(String name,char sex,int age){
		this(name ,sex);
		this.age=age;
		
	}
	public Person02(String name ,char sex,int age,double height){
		this(name,sex,age);
		this.height=height;
	}
	public Person02(String name,char sex,int age ,double height,String type){
		this(name,sex,age,height);
		this.type=type;
	}
	@Override
	public String toString() {
		return this.name;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		Person02 other =null;
		if(obj instanceof Person02){
			other=(Person02) obj;
			
		}else{
			return false;
		}
		if(obj==this){
			return true;
		}
		return this.name.equals(other.name)&&this.sex==other.sex&&
			this.age==other.age&&this.height-other.height<0.001&&
			this.type==other.type;
	}
	public abstract void doing();

public static void main(String[] args) {
//	Person02 p=new Person02("张飞",'女',18,1.7,"开朗");
//	p.say();
//	Person02 p1=new Person02("张飞",'男',24,1.8,"和蔼");
//	p1.say();
//	if(p.equals(p1)){
//		System.out.println("是一个人");
//	}else{
//		System.out.println("不是一个人");
//	}
//	Person02 p3=new Person02();
//	p3.sex='女';
//	p3.say();
}

}


