package com.eoe.pre.textday05;
import java.util.Arrays;
import java.util.Scanner;
/**
 * System.arraycopy()使用示例
 */
public class Crazy05 {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int[] b=new int[20];
		System.out.println(Arrays.toString(b));
		b=Arrays.copyOf(a, 6);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
