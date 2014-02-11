package com.eoe.se1.day01;

public class Test01 {
	static int a;
	static final int A=10;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Number2 num2=new Number2(5,10);
System.out.println(num2);
swap(num2);
System.out.println(num2);
	}
	static void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
	}
static class Number2{
	int a;
	int b;
public Number2() {
	// TODO Auto-generated constructor stub
}
public Number2(int a,int b){
super();
this.a=a;
this.b=b;
}
@Override
public String toString() {
	return "Number2[a="+a+",b="+b+"]";
}
}
}


