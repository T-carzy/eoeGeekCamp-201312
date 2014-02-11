package com.eoe.oop.day02.entity;

import com.eoe.oop.day02.entity.Person;

public class Student extends Person {
	public String inSchool;//所在学校
	public String inClass;//所在班级
	//无参构造方法
	public Student(){
		
	}
	//带参构造方法
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		//调用父类的带参构造方法，初始化name,sex,age,height和type属性
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	//覆写父类的say() 
	@Override
	public void say() {
		super.say();//调用父类的say()
		System.out.println("俺在"+inSchool+inClass+"学习");
	}
	//增加父类中没有的方法，实现两个变量值互换
	public void swap(int[] a,int i,int j){
		int c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	@Override
	public String toString() {
		return "姓名:"+this.name
			  +"  所在学校:"+inSchool
			  +"  所在班级:"+inClass;
	}
	@Override
	public boolean equals(Object obj) {
		Student other=null;
		if(obj==null){
			return false;
		}
		if(obj instanceof Student){
			other=(Student) obj;
		}else{
			return false;
		}
		if(other==this){
			return true;
		}
		return super.equals(other)
			  &&this.inSchool.equals(other.inSchool)
			  &&this.inClass.equals(other.inClass);
	}
	public static void main(String[] args) {
		Student stu1=new Student("张小飞", '男', 23, 1.79, "豪放的", "达内测试学院", "TCSD1209班");
		Student stu2=new Student("张小飞", '男', 23, 1.79, "豪放的", "达内测试学院", "TCSD1209班");
		System.out.println("stu1:"+stu1);
		System.out.println("stu2:"+stu2);
		System.out.println("stu1==stu2:"+(stu1==stu2));
		System.out.println("stu1与stu2是一个人:"+(stu1.equals(stu2)));
	}
}
