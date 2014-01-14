package com.eoe.sel.day01;

public class Test03 {


	public static void main(String[] args) {
			class Number2{
			int a;
			int b;
			public Number2() {
				
			}
			public Number2(int a, int b) {
				super();
				this.a = a;
				this.b = b;
			}
				 void swap(Number2 num) {
					 num.a+=num.b;
					 num.b=num.a-num.b;
					 num.a-=num.b;
				}
				@Override
				public String toString() {
					return "Number2 [a=" + a + ", b=" + b + "]";
				}
				 
			}
			Number2 num2=new Number2(11,99);
			System.out.println(num2);
			num2.swap(num2);
			System.out.println(num2);
	}

}
