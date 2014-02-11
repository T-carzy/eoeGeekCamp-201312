package com.eoe.basic.day02_;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 5   0101
		 +-3   1101
		 ----------
		   2   0010
		 */
		/*  5  0101
		 *  4  0100
		 *  -------
		 *  9  1001=-7
		 *     0111
		 * int 2 31=2G
		 * long fileSize=
		 */
		long fileSize=2200000000l;
		byte b=5;
		//b=(byte) (123+5);//128=10000000
		System.out.println(b);
		//b=5+122;
		System.out.println(b);
		//b=b+122;
		float f=3.5f;
		double d=2.6;
		System.out.println(d-2);
		if(d-2-0.6<0.000001){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		String path="d:/abc";
		char sex='男';
		System.out.println("System.out.println(\"男\");");
		System.out.println('\u4e2d');
		int a=-2;
		long l=a;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Long.toBinaryString(l));
	}

}
