package com.eoe.se2.day02;

public class Test10 {
	public static void main(String[] args) {
		int a = 0x127;
		int b = a & 0xff;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(b);
	}
}
