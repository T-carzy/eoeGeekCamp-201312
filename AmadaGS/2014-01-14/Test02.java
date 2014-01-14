package com.eoe.se1.day01;

public class Test02 {
	public static void main(String[] args) {
		Test02  t=new Test02();
		Number2 number=t.new Number2(45, 67);
		System.out.println(number);
		swap(number);
		System.out.println(number);
	}
	


  static void swap(Number2 num){
	int c=num.a;
	num.a=num.b;
	num.b=c;
}
	class Number2{
		int a;
		int b;
		public Number2(int a, int b) {
			//super();
			this.a = a;
			this.b = b;
		}
		@Override
		public String toString() {
			return "Number2 [a=" + a + ", b=" + b + "]";
		}
	}
}
