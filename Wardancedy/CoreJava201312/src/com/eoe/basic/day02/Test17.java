package com.eoe.basic.day02;

public class Test17 {

	/**
	 * ������ϰ:˵������b��ֵ
	 *  int i= Byte.MAX_VALUE + 1;
		byte b= (byte) i;
	 */
	public static void main(String[] args) {
		// int����ת��Ϊbyte����
		int i= Byte.MAX_VALUE + 1;
		byte b= (byte) i;
		System.out.println("int:" + i);
		System.out.println("byte:" + b);
	}
}
