package com.eoe.sel02.day02;

public class Test09 {
public static void main(String[] args) {
	int a=-5;//00000101 11111010  11111011
	System.out.println(Integer.toBinaryString(a));
	a=a>>>1;//高位补零01111101    11111101
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
}
}
