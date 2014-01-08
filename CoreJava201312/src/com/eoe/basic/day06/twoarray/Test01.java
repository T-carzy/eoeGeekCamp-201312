package com.eoe.basic.day06.twoarray;

public class Test01 {
	/**
	 * 二维数组打印九九表。
	 */
	public static void main(String[] args) {
		int[][]	 a=new int[9][9];
		//步骤1、计算i*j并将每个结果保存在二维数组的每个元素中。
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(i+1)*(j+1);
			}
		}
		//步骤2、打印二维数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print((i+1)+"*"+(j+1)+"=");
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
