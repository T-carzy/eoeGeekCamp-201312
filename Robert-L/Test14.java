package com.eoe.pre.oop.day03;

public class Test14 {
public static void main(String[] args) {
	class Number2{
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
		 void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
		}
	}
	Number2 num1=new Number2(2,4);
	System.out.println(num1.toString());
	num1.swap(num1);
	System.out.println(num1.toString());
	
}
}
