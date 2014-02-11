package com.eoe.pre.day06_.sort;

import java.util.Arrays;
import com.eoe.tools.MyTools;

public class Test01 {
	public static void main(String[] args) {
		int[] a={3,8,7,6,9,5};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		int i=0;
//		//找最大值
//		for(int j=i+1;j<a.length;j++){
//			if(a[i]<a[j]){
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		i++;//i=1
//		//将第二大数交换到a[1]
//		for(int j=i+1;j<a.length;j++){
//			if(a[i]<a[j]){
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		i++;//i=2
//		//将第三大数机交换到a[2]
//		for(int j=i+1;j<a.length;j++){
//			if(a[i]<a[j]){
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
		System.out.println(Arrays.toString(a));
	}
}
