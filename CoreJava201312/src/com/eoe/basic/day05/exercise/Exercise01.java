package com.eoe.basic.day05.exercise;

public class Exercise01 {

	/**
	 * 查找100～999之间的所有回文数。回文数是指：数字左右对称，例如101,121,232
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {//i代表百位数
			for(int j=0;j<=9;j++){//j代表十位数
				for(int k=0;k<=9;k++){//k代表个位数
					if(i==k){
						System.out.println(""+i+j+k);
					}
				}
			}
		}
	}

}
