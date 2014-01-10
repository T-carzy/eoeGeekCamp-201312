package com.eoe.pre.textday05;
/**
 * System.arraycopy()使用示例
 */
import java.util.Arrays;
public class Crazy02 {
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		int[] b=new int[3];
		System.arraycopy(a, 2, b, 1, 2);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
