package com.eoe.basic.day02_;

public class Test03 {

	/**
	 * 00000011=(3)10
	 * 10000011
	 * 01111101=26+25+24+23+22+1=-125
	 */
	public static void main(String[] args) {
		int value=Integer.MIN_VALUE;
		value=Integer.MAX_VALUE;
		value=Integer.parseInt("125");
		String bin=Integer.toBinaryString(15);
		System.out.println(bin);
		String hex=Integer.toHexString(15);
		System.out.println(hex);
	}

}
