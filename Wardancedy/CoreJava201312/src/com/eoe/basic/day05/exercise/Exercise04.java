package com.eoe.basic.day05.exercise;

import java.util.Scanner;

public class Exercise04 {

	/**
	 * 不用判断语句，输入百分制的分数，根据以下标准评定分数等级：
	   90～100:优秀
	   89-80:良好
	   79-70:中等
	   69-60:及格
	   0－59:不及格

	 */
	public static void main(String[] args) {
		String[] grade={
			"不及格","不及格","不及格","不及格","不及格","不及格",
			"及格","中等","良好","优秀","优秀"
		};
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入分数:");
		int score;
		do{
			score=scanner.nextInt();
		}while(score<0 || score>100);
		System.out.println(grade[score/10]);
	}

}
