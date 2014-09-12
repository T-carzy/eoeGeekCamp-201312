package com.eoe.pre.oop.day01;
public class Person02 {
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
public static void main(String[] args) {
	Person02 p=new Person02("张飞",'女',18,1.7,"开朗");
	p.say();
}

}


