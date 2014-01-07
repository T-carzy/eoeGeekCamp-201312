package com.eoe.pre.textday05;
import java.util.Arrays;

/**
 * 数组的增容、减容
 */
public class Crazy09 {
	public static void main(String[] args){
		int [] a={};
		System.out.println(a.length);
		a=Arrays.copyOf(a, a.length+1);
		System.out.println(a.length);
		a[a.length-1]=100;
		System.out.println(Arrays.toString(a));
		a=Arrays.copyOf(a, a.length-1);
		System.out.println(a.length);
	}

}
