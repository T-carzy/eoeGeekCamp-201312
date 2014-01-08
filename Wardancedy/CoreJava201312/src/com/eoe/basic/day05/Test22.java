package com.eoe.basic.day05;

import java.util.Arrays;

public class Test22 {
	/**
	 * 编写方法swap，交换两个变量值，测试该方法的交换结果
	 * 能否影响调用处的变量。
	 */
	public static void main(String[] args) {
		int[] a={50,40,30,20,10};
		//打印swap()调用前数组的值
		System.out.println("swap()调用前，数组a的值"+Arrays.toString(a));
		swap(a[0],a[1]);//将a[0]和a[1]的值传递给swap()
		//打印swap()调用后数组的值
		System.out.println("swap()调用后，数组a的值"+Arrays.toString(a));
	}
	//swap()交换两个变量值
	static void swap(int a1,int a2){
		int c=a1;
		a1=a2;
		a2=c;
	}
}
