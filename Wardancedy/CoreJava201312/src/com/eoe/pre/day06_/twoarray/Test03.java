package com.eoe.pre.day06_.twoarray;

import java.util.Arrays;

public class Test03 {

	/**��ӡ�������ַ���
	 *  1  2  3  4  5 
	   16 17 18 19  6 
	   15 24 25 20  7 
	   14 23 22 21  8 
	   13 12 11 10  9

	 */
	public static void main(String[] args) {
		//��̬��ʼ����ά����
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
		//��������ת��ӡ
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
