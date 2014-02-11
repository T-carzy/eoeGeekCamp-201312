package com.eoe.pre.day06_.sort;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 65, 97, 49, 38 };
		System.out.println(Arrays.toString(a));
//		int i=1;
//		// 将最大值交换到数组最后
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		i++;//i=2
//		System.out.println(Arrays.toString(a));
//		// 将第二大值交换至数组的倒数第二个元素的位置
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		i++;//i=3
//		// 将第三大值交换至数组的倒数第三个元素的位置
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++){
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
