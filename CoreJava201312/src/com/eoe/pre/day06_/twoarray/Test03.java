package com.eoe.pre.day06_.twoarray;

import java.util.Arrays;

public class Test03 {

	/**打印以下数字方阵
	 *  1  2  3  4  5 
	   16 17 18 19  6 
	   15 24 25 20  7 
	   14 23 22 21  8 
	   13 12 11 10  9

	 */
	public static void main(String[] args) {
		//静态初始化二维数组
		int[][] a={
			{1,2,3,4,5},
			{16,17,18,19,6},
			{15,24,25,20,7},
			{14,23,22,21,8},
			{13,12,11,10,9}
		};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//换方向旋转打印
		for(int i=a.length-1;i>=0;i--){
			for(int j=a[i].length-1;j>=0;j--){
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
