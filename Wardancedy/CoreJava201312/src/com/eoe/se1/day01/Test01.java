package com.eoe.se1.day01;

public class Test01 {
	static int a;
	static final int A=10;
	int b;
	public static void main(String[] args) {
		Number2 num2=new Number2(5,10);
		//��ӡ����ǰ�Ľ��
		System.out.println(num2.toString());
		//����num2�е�a��b
		swap(num2);
		//��ӡ������Ľ��
		System.out.println(num2);
	}
	static void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
	}
	//Number2��һ����������ʵ����
	static class Number2{
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
		@Override
		public String toString() {
			return "Number2 [a=" + a + ", b=" + b + "]";
		}
	}
}
