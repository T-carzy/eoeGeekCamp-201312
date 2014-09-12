package com.eoe.se1.day01;

public class Test01 {
	public static void main(String[] args) {
		Number2 number=new Number2(23,50);
		System.out.println(number);
		swap(number);
		System.out.println(number);
	}
	
	static void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
	}
	
	//定义一个静态内部类
	static class Number2{
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
}
