package com.eoe.pre.oop.day01;



public class Student {
	String name;
	char sex;
	int age;
	double height;
	String type;
	String inSchool;
	String inClass;
	public Student(String name, char sex, int age, double height,
			String inSchool, String inClass, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.inSchool = inSchool;
		this.inClass = inClass;
		this.type = type;
	}
	public void say(){
		System.out.println("嗨，大家好，俺叫"+name+",今年"
				+age+"岁,身高"+height+"米,俺是一个"
				+type+sex+"士");
			System.out.println("俺在"+inSchool+inClass+"学习");
	
	}
public void feeling(String cause,String content){
	System.out.println(cause);
	System.out.println(content);
	}
public void swap(int[] a,int i,int j){
	
    a[i]+=a[j];
	a[j]=a[i]-a[j];
	a[i]-=a[j];
	
}
public Student() {
	
}
public static void main(String[] args) {
	Student p1 = new Student();
	p1.name="高珊";
	p1.sex='女';
	p1.age=22;
	p1.height=1.69;
	p1.type="活泼的";
	p1.inSchool="eoe极客学院";
	p1.inClass="Android1205班";
	p1.say();
	p1.feeling("我走桃花运了","哈哈、、、");
	System.out.println("俺给大家表演两个变量相交换的算法");
	int[] aa={10,20};
	System.out.println(aa[0]+" "+aa[1]);
	p1.swap(aa,0,1);
	System.out.println("变");
	System.out.println(aa[0]+" "+aa[1]);
	Student p2 = new Student();
	p2.name="李伟";
	p2.sex='男';
	p2.age=22;
	p2.height=1.8;
	p2.type="暴躁的";
	p2.inSchool="eoe极客学院";
	p2.inClass="Android1205班";
	p2.say();
	p2.feeling("我捡了500万","哈哈、、、");
	System.out.println("俺给大家表演两个变量相交换的算法");
	int[] bb={30,50};
	System.out.println(bb[0]+" "+bb[1]);
	p1.swap(bb,0,1);
	System.out.println("变");
	System.out.println(bb[0]+" "+bb[1]);
}
}
