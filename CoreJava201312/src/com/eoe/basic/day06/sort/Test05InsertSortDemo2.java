package com.eoe.basic.day06.sort;

import java.util.Arrays;
import java.util.Random;

public class Test05InsertSortDemo2 {
	public static void main(String[] args) {
		int[] a=new int[10];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
//		int i=3;
//		int k=a[i];
//		int j;
//		for (j =i-1; j>=0&&k<a[j];j--) {
//			a[j+1]=a[j];
//		}
//		a[j+1]=k;
//		i++;//i=4
//		k=a[i];
//		for(j=i-1;j>=0&&k<a[j];j--){
//			a[j+1]=a[j];
//		}
//		a[j+1]=k;
		//
		for (int i = 1; i < a.length; i++) {
			int k=a[i];
			int j;
			for(j=i-1;j>=0&&k<a[j];j--){
				a[j+1]=a[j];
			}
			a[j+1]=k;
		}
		System.out.println(Arrays.toString(a));
		
	}
}
