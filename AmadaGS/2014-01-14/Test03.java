package com.eoe.se1.day01;

public class Test03 {
	public static void main(String[] args) {
		class Number{
			int a;
			int b;
			public Number(int a, int b) {
				super();
				this.a = a;
				this.b = b;
			}
			@Override
			public String toString() {
				return "Number [a=" + a + ", b=" + b + "]";
			}
			public void swap(Number num){
				int c=num.a;
				num.a=num.b;
				num.b=c;
			}
		}
		Number number=new Number(34, 78);
		System.out.println(number);
		number.swap(number);
		System.out.println(number);
	}

}
