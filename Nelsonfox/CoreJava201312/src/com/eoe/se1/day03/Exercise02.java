package com.eoe.se1.day03;

public class Exercise02 {


public static void main(String[] args) {
	Exercise02 e=new Exercise02();
	Number2 num2=e.new Number2(5,10);
	System.out.println(num2);//交换前的值
	swap(num2);
	System.out.println(num2);//交换后的值
	}
static void swap(Number2 num){
	int c=num.a;
	num.a=num.b;
	num.b=c;
}
private class Number2{
	int a;
	int b;
	public Number2(){
		
	}
	public Number2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Number2 [a=" + a + ", b=" + b + "]";
	}
	
}
}
