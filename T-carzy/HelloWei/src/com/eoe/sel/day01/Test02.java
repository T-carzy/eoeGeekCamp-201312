package com.eoe.sel.day01;



public class Test02 {

	
	public static void main(String[] args) {
		Test02 t=new Test02();
		Number2 num2=t.new Number2(10,90);
		System.out.println(num2);
		swap(num2);
		System.out.println(num2);
	}
	static void swap(Number2 num){
		num.a+=num.b;
		num.b=num.a-num.b;
		num.a-=num.b;
	}
	private class Number2{
		int a;
		int b;
		public Number2() {
			// TODO Auto-generated constructor stub
		}
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
