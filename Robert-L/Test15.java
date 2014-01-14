package com.eoe.pre.oop.day03;

public class Test15 {
public static void main(String[] args) {
	Test15 t=new Test15();
	Number2 num1=t.new Number2(20,30);
	System.out.println(num1);
	swap(num1);
	System.out.println(num1);
}
private class Number2{
	int a;
	int b;
	public Number2() {
		// TODO Auto-generated constructor stub
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
static void swap(Number2 num2){
	int c=num2.a;
	num2.a=num2.b;
	num2.b=c;
	
	
}
}
