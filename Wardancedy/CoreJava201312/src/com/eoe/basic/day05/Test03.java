package com.eoe.basic.day05;

import java.util.Arrays;

public class Test03 {

	/**
	 * ��������ݡ�����
	 */
	public static void main(String[] args) {
		int[] a={};
		System.out.println(a.length);
		a=Arrays.copyOf(a, a.length+1);
		System.out.println(a.length);
		a[a.length-1]=100;
		System.out.println(Arrays.toString(a));
		a=Arrays.copyOf(a, a.length-1);
		System.out.println(a.length);
	}

}
