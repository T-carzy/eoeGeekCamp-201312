package com.eoe.Oop;

public class Test06 {
	public static void main(String[] args) {
		Number num = new Number(5, 10);
		System.out.println("num.a=" + num.a + " num.b=" + num.b);
		swap(num);
		System.out.println("num.a=" + num.a + " num.b=" + num.b);
	}

	static void swap(Number number) {
		int t = number.a;
		number.a = number.b;
		number.b = t;
	}
}

class Number {
	int a;
	int b;

	public Number() {

	}

	public Number(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
}
