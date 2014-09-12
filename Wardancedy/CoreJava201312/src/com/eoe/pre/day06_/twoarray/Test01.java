package com.eoe.pre.day06_.twoarray;

public class Test01 {

	/**
	 * 用二维数组打印九九表
	 */
	public static void main(String[] args) {
		int[][] a=new int[9][9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=i; j++) {
				a[i][j]=(i+1)*(j+1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=i; j++) {
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print((i+1)+"*"+(j+1)+"="+a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
