package com.eoe.oop.day01;

public class Work07 {
	private int b;
	private int a;

	// 用对象封装交换的两个变量，实现两个变量值互换
	public Work07() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Number2 num = new Number2(5, 10);
		System.out.println(num.a + " " + num.b);
		swap(num);
		System.out.println(num.a + " " + num.b);
	}

	static void swap(Number2 number) {
		number.a += number.b;
		number.b = number.a - number.b;
		number.a -= number.b;
	}

}

class Number2 {
	int a;
	int b;

	public Number2() {

	}

	public Number2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
}
