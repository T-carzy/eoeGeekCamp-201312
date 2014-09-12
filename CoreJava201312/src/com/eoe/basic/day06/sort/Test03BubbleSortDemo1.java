package com.eoe.basic.day06.sort;

import java.util.Arrays;
import java.util.Random;

public class Test03BubbleSortDemo1 {
	public static void main(String[] args) {
		int[] a=new int[10];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
//		int i;
//		i=1;
//		System.out.println(Arrays.toString(a));
//		//找出最小分－>a[9]
//		for (int j = 0; j < a.length-i; j++) {
//			if(a[j]<a[j+1]){
//				int c=a[j];
//				a[j]=a[j+1];
//				a[j+1]=c;
//			}
//		}
//		i++;//i=2;
//		//找出倒数第二小分－>a[8]
//		for(int j=0;j<a.length-i;j++){
//			if(a[j]<a[j+1]){
//				int c=a[j];
//				a[j]=a[j+1];
//				a[j+1]=c;
//			}
//		}
//		i++;//i=3
//		//找出倒数第三小分－>a[7]
//		for(int j=0;j<a.length-i;j++){
//			if(a[j]<a[j+1]){
//				int c=a[j];
//				a[j]=a[j+1];
//				a[j+1]=c;
//			}
//		}
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for(int j=0;j<a.length-i;j++){
				if(a[j]<a[j+1]){
					int c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}	
		}
		System.out.println(Arrays.toString(a));
	}
}
