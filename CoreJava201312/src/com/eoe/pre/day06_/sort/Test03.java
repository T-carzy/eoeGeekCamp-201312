package com.eoe.pre.day06_.sort;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		int[] a = { 32, 65, 49, 58, 97 };
		System.out.println(Arrays.toString(a));
		// [65,32]
		for (int i = 1; i < a.length; i++) {
			int j;
			int k = a[i];
			for (j = i - 1; j >= 0 && k > a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = k;
			System.out.println(Arrays.toString(a));
		}
		// int i=1;
		// int j;
		// int k=a[i];
		// for(j=i-1;j>=0&&k>a[j];j--){
		// a[j+1]=a[j];
		// }
		// a[j+1]=k;
		// System.out.println(Arrays.toString(a));
		// i++;//i=2
		//
		// k=a[i];
		// for(j=i-1;j>=0&&k>a[j];j--){
		// a[j+1]=a[j];
		// }
		// a[j+1]=k;
		// System.out.println(Arrays.toString(a));
		// i++;//i=3
		// k=a[i];
		// for(j=i-1;j>=0&&k>a[j];j--){
		// a[j+1]=a[j];
		// }
		// a[j+1]=k;
		// System.out.println(Arrays.toString(a));

	}
}
