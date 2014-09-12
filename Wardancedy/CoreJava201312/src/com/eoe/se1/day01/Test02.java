package com.eoe.se1.day01;

public class Test02 {
	public static void main(String[] args) {
		Test02 t=new Test02();
		Number2 num2=t.new Number2(5,10);
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
		public Number2() {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param a
		 * @param b
		 */
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

