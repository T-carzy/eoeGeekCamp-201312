package com.eoe.pre.oop.day01;


public class Test07 {
	public static void main(String[] args) {
Student s1=new Student();
s1.name="李鹏";
s1.sex='男';
s1.age=25;
s1.height=1.7;
s1.inSchool="eoe极客学院";
s1.inClass="android1205班";
s1.type="豪放的";
s1.say();
s1.feeling("我失恋了！", "呜呜、、、");
System.out.println("我给大家表演两个变量相交换的算法");
int[] aa={10,100};
System.out.println("a="+aa[0]+"   b="+aa[1]);
s1.swap(aa,0,1);
System.out.println("变");
System.out.println("a="+aa[0]+"  b="+aa[1]);
}
}