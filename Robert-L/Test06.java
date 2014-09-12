package com.eoe.pre.oop.day03;

public class Test06 {
	public static void main(String[] args) {
		// 定义二维数组
		int[][] a2 = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 },
				{ 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };
		// foreach循环遍历二维数组
		for (int[] a1 : a2) {// a1是一维数组
			for (int a : a1) {// a是一维数组的元素

				if (a < 10) {
					// 一位数前打印一个空格，目的是与两位数对齐
					System.out.print(" ");
				}
				System.out.print(a + " ");
			}
			System.out.println();// 换行
		}
	}
}
