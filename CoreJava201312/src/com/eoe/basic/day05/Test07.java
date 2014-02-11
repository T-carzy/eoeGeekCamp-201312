package com.eoe.basic.day05;

import java.util.Scanner;

public class Test07 {
	/*现场编程，输入百分制的分数，
	 * 100~90:优秀
	 * 89-80:良好
	 * 79-70:中等
	 * 69-60:及格
	 * 0－59:不及格
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制的分数：");
		int score;
		do{
			score=scanner.nextInt();
		}while(score<1 || score>5);
		String[] grades={
			"不及格","不及格","不及格","及格","良好","优秀"
		};
		System.out.println(grades[score]);		
	}

}
