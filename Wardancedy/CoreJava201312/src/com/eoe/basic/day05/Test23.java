package com.eoe.basic.day05;

import java.util.Arrays;

public class Test23 {
	/**
	 * 编写方法swap，交换两个变量值，测试该方法的交换结果
	 * 能否影响调用处的变量。
	 */
	public static void main(String[] args) {
		int[] a={50,40,30,20,10};
		//打印swap()调用前数组的值
		System.out.println("swap()调用前，数组a的值"+Arrays.toString(a));
		swap(a,0,1);//将数组a的地址和两个数组元素的下标传递给swap()
		//打印swap()调用后数组的值
		System.out.println("swap()调用后，数组a的值"+Arrays.toString(a));
	}
	//swap()交换两个变量值，数组作为参数，同时接收两个元素的下标
	static void swap(int b[],int i,int j){
		//交换b[i]和b[j]的值
		int c=b[i];
		b[i]=b[j];
		b[j]=c;
	}
}
