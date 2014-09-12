package com.eoe.basic.day06.twoarray;

public class Test04 {
	/** 打印以下旋转方阵
	 * 
	 *  1  2  3  4  5 
	   16 17 18 19  6 
	   15 24 25 20  7 
	   14 23 22 21  8 
	   13 12 11 10  9 
 	    
 	    9 10 11 12 13 
 	    8 21 22 23 14 
 		7 20 25 24 15 
 		6 19 18 17 16 
 		5  4  3  2  1 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a={
			{ 1, 2, 3, 4, 5},
			{16,17,18,19, 6},
			{15,24,25,20, 7},
			{14,23,22,21, 8},
			{13,12,11,10, 9}
		};
		//打印第一个方阵
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//打印第二个方阵
		for (int i = a.length-1; i>=0;i--) {
			for (int j = a[i].length-1; j >=0; j--) {
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
