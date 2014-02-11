package com.eoe.learnjava.day06;



public class Double_array {

	/**
	 * 二维数组打印99表
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a=new int[9][9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(i+1)*(j+1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[i].length; j++) {
				System.out.print((i+1)+"*"+(j+1)+"=");
				if (a[i][j]<10) {
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
