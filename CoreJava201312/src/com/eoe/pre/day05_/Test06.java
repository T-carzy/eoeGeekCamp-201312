package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test06 {

	/**
	 * 不用判断语句给5分制的分数评定成绩等级。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score;
		do{
			System.out.println("scores=");
			score=scanner.nextInt();
		}while(score<0 || score>5);
		/*   0,    1,     2     3    4     5
		 * 不及格 不及格 不及格 及格     良好   优秀
		 */
		String[] grades={"不及格","不及格","不及格",
				"及格","良好","优秀"};
		System.out.println(grades[score]);
		//输入月份，显示天数
	}

}
