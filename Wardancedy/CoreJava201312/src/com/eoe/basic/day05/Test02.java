package com.eoe.basic.day05;

import java.util.Arrays;

public class Test02 {

	/**
	 * System.arraycopy()Ê¹ÓÃÊ¾Àý
	 */
	public static void main(String[] args) {
		int[] a={10,8,7,12,6};
		int[] b=new int[10];
		//System.arraycopy(a, 1, b, 0, 3);
		b=Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
