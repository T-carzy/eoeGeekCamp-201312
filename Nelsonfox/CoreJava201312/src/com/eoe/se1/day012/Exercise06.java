package com.eoe.se1.day012;

public class Exercise06 {
	//成员内部类
public static void main(String[] args) {
	//创建外部类的对象
	Exercise06 e=new Exercise06();
	//通过外部类的引用变量调用成员内部类的构造方法创建成员内部类的对象
Number2 number=e.new Number2(5,10);
System.out.println(number);
swap(number);//交换封装在对象中的两个成员变量的值
System.out.println(number);
}
static void swap(Number2 num){
	int c=num.a;
	num.a=num.b;
	num.b=c;
	}
//成员内部类Number2：封装了两个int类型的变量，用来交换两个变量值
class Number2{
	int a;
	int b;
	public Number2(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Number2 [a=" + a + ", b=" + b + "]";
	}
	
}
}
