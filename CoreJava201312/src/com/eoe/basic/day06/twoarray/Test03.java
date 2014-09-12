package com.eoe.basic.day06.twoarray;

import java.util.Arrays;

public class Test03 {
	/** 打印以下旋转方阵
	 *  1  2  3  4  5 
	   16 17 18 19  6 
	   15 24 25 20  7 
	   14 23 22 21  8 
	   13 12 11 10  9 
	 */
	public static void main(String[] args) {
		int[][] a={
			{ 1, 2, 3, 4, 5},
			{16,17,18,19, 6},
			{15,24,25,20, 7},
			{14,23,22,21, 8},
			{13,12,11,10, 9}
		};
		//按一维数组的方式打印方阵
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
