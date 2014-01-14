package com.eoe.sel.day01;

public class Test01 {
	static int a;
	static final int A=10;
	int b;


	public static void main(String[] args) {
			Number2 num2=new Number2(10,20);
			System.out.println(num2.toString());
			swap(num2);
			System.out.println(num2);
	}
	static void swap(Number2 num){
		num.a+=num.b;
		num.b=num.a-num.b;
		num.a-=num.b;
	}
	static class Number2{
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
