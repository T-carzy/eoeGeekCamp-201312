package com.eoe.basic.day02_;

public class Test05 {

	/**
	 * long类型的数据存放至double类型精度丢失
	 */
	public static void main(String[] args) {
//		int i=0x1000001;//01 0000 0000 0000 0000 0000  0001
//		float f=i;
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Integer.toBinaryString((int)f));
		long l=0x100000000000001l;
		double d=l;
		System.out.println(Long.toBinaryString(l));
		System.out.println(Long.toBinaryString((long)d));
	}

}
