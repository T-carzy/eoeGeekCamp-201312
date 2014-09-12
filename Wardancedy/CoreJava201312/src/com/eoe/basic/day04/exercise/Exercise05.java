package com.eoe.basic.day04.exercise;

import java.util.Scanner;

public class Exercise05 {
	/*
	 * *7、由人通过键盘输入一个0～99之间的整数，
	 * 让电脑用二分查找法找到该数。
	文件名：Exercise06.java  
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入要猜的数:");
		int guessed=scanner.nextInt();
		int min=0;
		int max=99;
		int count=0;
		int guess=(min+max)/2;//中间数，二分查找
		boolean find=false;//代表是否猜到，true：猜到
		while(!find){
			System.out.println(guess);
			count++;//统计查找次数
			if(guess==guessed){
				find=true;
			}else if(guess<guessed){
				//  65  49
				// 50-99
				min=guess;//调整下界为guess
			}else{
				//32 49   0-49
				max=guess;//调整上界为guess
			}
			guess=(min+max)/2;
		}
		System.out.println(guess+"共查找了"+count+"次");
	}
}
