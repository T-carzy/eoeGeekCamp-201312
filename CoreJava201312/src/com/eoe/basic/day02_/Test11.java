package com.eoe.basic.day02_;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10;
		int b=100;
		System.out.println("a="+a+"  b="+b);
//		int c=a;// a=10 b=100   c=10
//		a=b;   //  a=100 b==100 c=10
//		b=c;
		a+=b; //a=10+100 b=100
		b=a-b;// a=10+100 b=10
		a-=b; // a=100 b=10
		System.out.println("a="+a+"  b="+b);		
	}

}
