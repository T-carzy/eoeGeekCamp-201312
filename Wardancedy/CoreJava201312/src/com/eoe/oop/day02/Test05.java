package com.eoe.oop.day02;

public class Test05 {
	/**
	 * �����ʼ������
	 */
	public static void main(String[] args) {
		ChildClass5 c=new ChildClass5();
		System.out.println("c.a="+c.a+"\tc.b="+c.b);
	}
}
//����
class SuperClass5{
	int a=1;
	public SuperClass5(){
		a=2;
	}
}
//����
class ChildClass5 extends SuperClass5{
	int b=2;
	public ChildClass5(){
		super.a=3;
		b=5;
	}
}
