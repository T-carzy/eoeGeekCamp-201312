package com.eoe.se2.day02;

public class Test09 {
	public static void main(String[] args) {
		int a = -5;
		System.out.println(Integer.toBinaryString(a));
		a = a >> 1;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);

	}
}
