package com.eoe.basicLearn.day02;

public class Test08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=Byte.MAX_VALUE+1;
     byte b= (byte) i;
	 System.out.println("int:" + i);
	 System.out.println("byte:" + b);
	 char c=65;
	 System.out.println(c);
	 int d='a';
	 System.out.println(d);
	 char ca='a';
     int e=ca+13;
      //char cb=(char) (ca+1);
		System.out.println((char)e);
		System.out.println((int)((char)e));
		System.out.println("\t���ڵ�11��λ�ÿ�ʼ��ʾ��Ӵ��");
		System.out.println("/t���ڵ�11��λ�ÿ�ʼ��ʾ��Ӵ��");
		System.out.print("��һ��������Ҳ���ͬһ��\n˫���źͰ�һ���������");
		System.out.println("\n\"˫���źͰ�һ���������\"");
		System.out.println("��ʾһ��·����D:\\eoeschool\\docs");
	}
}
