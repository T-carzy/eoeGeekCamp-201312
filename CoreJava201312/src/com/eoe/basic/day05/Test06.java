package com.eoe.basic.day05;

public class Test06 {
	/**
	 * 用三重循环找出水仙花数。
	 */
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					int value=i*100+j*10+k;
					if(i*i*i+j*j*j+k*k*k==value){
						System.out.println(value);
					}
				} //end for
			} //end for
		} //end for
	} //end main
}
