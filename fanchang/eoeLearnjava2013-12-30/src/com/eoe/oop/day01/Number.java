package com.eoe.oop.day01;

public class Number {

	/**
	 * @param args
	 */
	int a;
	int b;
//�޲ε�
	public Number() {
		super();
	}
//��2�������Ĺ��췽��
	public Number(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	private static void swap(Number number) {
		int c=number.a;
		number.a=number.b;
		number.b=c;
		
	}
	public static void main(String[] args) {
		//���Զ�����Ϊ�����Ĳ���ʵ�����������Ļ���
		Number num = new Number(10,5);
		swap(num);
		System.out.println(num.a+" "+num.b);
	}


}
