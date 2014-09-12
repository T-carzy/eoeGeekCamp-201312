package com.eoe.se1.day012;

public class Exercise05 {

	public Exercise05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Number2 number=new Number2(10,5);
	//显示交换前的对象的两个成员变量的值
System.out.println(number);
swap(number);
System.out.println(number);
	}
	//swap（）狡猾num中的两个变量值
	static void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
	}
	//静态内部类Number2；封装了两个int类型的变量，用于交换两个变量的值
	static class Number2{
	
		int a;
		int b;
	
	public Number2(int a, int b) {
		this.a=a;
		this.b=b;
	}
		
	
	@Override
	public String toString() {
		return "Number2 [a=" + a + ", b=" + b + "]";
	}
	
	}
	}

