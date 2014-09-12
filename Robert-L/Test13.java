package com.eoe.pre.oop.day03;

public class Test13 {
	public static void main(String[] args) {
		Number num1 = new Number(10, 20);
		System.out.println(num1.toString());
		swap(num1);
		System.out.println(num1.toString());
	}

	static class Number {
		int a;
		int b;

		public Number() {
			// TODO Auto-generated constructor stub
		}

		public Number(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "Number [a=" + a + ", b=" + b + "]";
		}
	}

	static void swap(Number num) {
		int c = num.a;
		num.a = num.b;
		num.b = c;
	}
}
