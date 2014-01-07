package com.eoe.pre.textday05;

public class Crazy16 {

	/**
	 * 用三重循环打印100～999
	 */
	public static void main(String[] args) {
			for(int i=0;i<=9;i++){
				for(int j=0;j<=9;j++){
					for(int k=0;k<=9;k++){
						System.out.print(i*100+j*10+k+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
	}

}
