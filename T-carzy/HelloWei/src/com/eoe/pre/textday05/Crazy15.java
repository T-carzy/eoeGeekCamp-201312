
package com.eoe.pre.textday05;
/**
 * 用三重循环找出水仙花数。
 */


public class Crazy15 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				for(int k=1;k<=9;k++){
					if(i*100+j*10+k==i*i*i+j*j*j+k*k*k){
						System.out.println("水仙花数有："+(i*100+j*10+k));
					}
				}
			}
		}
	}

}
