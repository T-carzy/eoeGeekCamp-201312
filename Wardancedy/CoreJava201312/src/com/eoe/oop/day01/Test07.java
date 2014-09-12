package com.eoe.oop.day01;

public class Test07 {
	//用对象封装交换的两个变量，实现两个变量值互换
	public static void main(String[] args) {
		Number2 num=new Number2(5, 10);
		System.out.println(num.a+" "+num.b);
		swap(num);//交换n.a和n.b的值
		System.out.println(num.a+" "+num.b);
	}

	static void swap(Number2 number) {
		number.a += number.b;
		number.b = number.a - number.b;
		number.a -= number.b;
	}
}
class Number2{
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
}
