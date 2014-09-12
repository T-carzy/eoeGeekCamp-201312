package com.eoe.basic.day05;

public class Test05 {
	/**
	 * 用三重循环打印100～999
	 */
	public static void main(String[] args) {
		for(int i=0;i<=9;i++){ //外层循环代表百位数
			for(int j=0;j<=9;j++){ //中间层循环代表十位数
				for(int k=0;k<=9;k++){ //最内层循环代表个位数
					System.out.print(i*100+j*10+k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
