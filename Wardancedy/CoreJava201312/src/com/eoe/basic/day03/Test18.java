package com.eoe.basic.day03;

import java.util.Scanner;

public class Test18 {
	/**
	 * 键盘输入java、android和oracle三科分数，找出其中最高分。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("java android oracle:");
		int java=scanner.nextInt();
		int android=scanner.nextInt();
		int oracle=scanner.nextInt();
		if(java>=android && java>=oracle){
			System.out.println("最高分"+java);
		}else if(android>=oracle){
			System.out.println("最高分"+android);
		}else{
			System.out.println("最高分"+oracle);
		}
	}
}
