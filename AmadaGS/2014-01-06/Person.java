package com.eoe.oop.Day01;

public class Person {

	/**
	 * @param args
	 */
	//定义了对象的成员变量
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	//定义了对象的方法
	public void say(){
		System.out.println("俺叫"+name+",今年"+age+
				",身高"+height+",俺是个"+type+"的"+sex+"士");
	}
	//带参数的方法
	public void feeling(String cause, String content){
		System.out.println(cause+" "+content);
		//System.out.println(content);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建了第一个对象
		Person p1=new Person();
		p1.name="高珊";
		p1.age=24;
		p1.height=1.67;
		p1.sex='女';
		p1.type="热情";
		p1.say();
		p1.feeling("我中了五百万，心里很高兴", "哈哈。。");
		
		//创建了第二个对象
	    p1=new Person();
	    p1.name="李四";
	    p1.age=23;
	    p1.sex='男';
	    p1.type="闷骚";
	    p1.height=1.78;
	    p1.say();
	    p1.feeling("我考试得了100分", "嘿嘿。。。。。");	
	}

}
