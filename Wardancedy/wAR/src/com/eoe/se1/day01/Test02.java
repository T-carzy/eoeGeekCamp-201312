package com.eoe.se1.day01;

import javax.management.loading.PrivateClassLoader;

import com.eoe.se1.day01.Test01.Number2;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test02 t=new Test02();
Number2 num2=t.new Number2(5,10);
System.out.println(num2);
swap(num2);
System.out.println(num2);
	}
	static void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.a=c;
		
	}
private class Number2{
	int a;
	int b;
	public Number2(){
		
	}
	public Number2(int a,int b){
		super();
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Number2 [a=" + a + ", b=" + b + "]";
	}
	
}
}
