package com.eoe.basic.day06.sort;

import java.util.Arrays;
/**
 * 插入排序
 * 从数组第2个元素开始。
 * 向前面已排序(升序)的数组插入该元素
 *    例如：a[3]向{10,25,50}插入：
 *    {10,25,50,20,45}
 *  插入前先将a[3]的值保存在一个临时变量k中。
 *  循环变量j从2开始，每次递减，循环继续的条件是i>=0&&k>a[j]
 *  循环体：a[j+1]=a[j]：将数组元素的值依次后移一位，为插入腾地。
 *  循环结束后，将k的值复制给a[j+1].
 */
public class Test04InsertSortDemo1 {
	public static void main(String[] args) {
		int[] a={32,65,49,58,97};
		System.out.println(Arrays.toString(a));
		int i;
		i=1;
		int k=a[i];
		int j;
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=2
		k=a[i];
		for (j =i-1; j>=0&&k>a[j];j--) {
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=3
		k=a[i];
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
		i++;//i=4
		k=a[i];
		for(j=i-1;j>=0&&k>a[j];j--){
			a[j+1]=a[j];
		}
		a[j+1]=k;
//		for (int i = 1; i < a.length; i++) {
//			//将a[i]的值保存在临时变量k中
//			int k=a[i];
//			int j;
//			//循环从i-1至0,循环继续的条件是j>=0并且k的值小于a[j]
//			for(j=i-1;j>=0&&k>a[j];j--){
//				a[j+1]=a[j];//每次将数组元素的值依次后移一位
//			}
//			//循环结束后，将k的值插入至a[j+1],因j的值多减了一次。
//			a[j+1]=k;
//		}
		System.out.println(Arrays.toString(a));
		
	}
}
