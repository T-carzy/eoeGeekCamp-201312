package com.eoe.basic.day06;

import java.util.Arrays;
import java.util.FormattableFlags;
import java.util.Random;
import java.util.Scanner;

/*
   计数排序。   
 */
public class Test0 {
	public static void main(String[] args) {
		int[] a = {5,5,4,3,4,2,2,3,1,0};
		System.out.println(Arrays.toString(a));
		int[] b=new int[6];
		for(int i=0;i<a.length;i++){
			b[a[i]]++;
			//b[5]=2  b[4]=2 b[3]=2 b[2]=2 b[1]=1 b[0]=1
		}
		for(int i=b.length-1;i>=0;i--){
			for(int j=1;j<=b[i];j++){
				//打印份数是i的重复值
				System.out.print(i+" ");
			}
		}
	}

	static void swap(int[] b, int i, int j) {
		b[i] += b[j];
		b[j] = b[i] - b[j];
		b[i] -= b[j];
	}
}
