package com.eoe.basic.day03;

import java.util.Scanner;

public class Test15 {
	/**
	 * 输入考试成绩，若达到60及60分以上，则显示：成绩合格
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入考试成绩：");
		int score=scanner.nextInt();
		if(score>=60){
			System.out.println("成绩合格");
		}
	}
}
