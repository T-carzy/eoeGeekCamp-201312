package com.eoe.basic.day03;

import java.util.Scanner;

public class Test16 {
	/**
	 * 输入两个数，找最大数。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入两个数：");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if(a>b){
			System.out.println("最大数是"+a);
		}else{
			System.out.println("最大数是"+b);
		}
	}
}
