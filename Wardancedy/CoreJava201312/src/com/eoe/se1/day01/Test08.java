package com.eoe.se1.day01;

public class Test08 {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		
		try{
			int c=a/b;
			System.out.println(c);
			int[] d=new int[2];
			System.out.println(d[2]);
			System.out.println("�����ᱻִ�е�");
		}catch(ArithmeticException e){
			System.out.println("�������"); 
		}finally{
			System.out.println("�����Ƿ����쳣�����������ִ�е�");
		}
	}
}
