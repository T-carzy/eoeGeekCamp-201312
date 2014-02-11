package com.eoe.sel02.day02;

public class Test10 {
public static void main(String[] args) {
	int a=2;//00000010
	System.out.println(Integer.toBinaryString(a));
	a=a<<10;
	System.out.println(Integer.toBinaryString(a));
	System.out.println(a);
}
}
