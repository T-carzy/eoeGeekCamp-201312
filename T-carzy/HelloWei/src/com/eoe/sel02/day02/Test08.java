package com.eoe.sel02.day02;

public class Test08 {
public static void main(String[] args) {
	int a=0x221;  //0000001000100001
	int b=a&0xff; //0000000011111111
				  //        00100001
	System.out.println(a&b);
	System.out.println(Integer.toBinaryString(b));
}
}
