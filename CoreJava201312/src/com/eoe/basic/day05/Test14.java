package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Random;
/**
 * Arrays.copyOfÊ¾Àý
 */
public class Test14 {
	public static void main(String[] args) {
		int[] src={3,4,5,7,9,12};
		int[] dest=new int[5];
		dest=Arrays.copyOf(src, 5);
		System.out.println("src="+Arrays.toString(src));
		System.out.println("dest="+Arrays.toString(dest));
		
	}
}
