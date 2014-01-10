package com.eoe.pre.textday05;

import java.util.Scanner;

public class Crazy17 {

	/*现场编程，输入百分制的分数，
	 * 100~90:优秀
	 * 89-80:良好
	 * 79-70:中等
	 * 69-60:及格
	 * 0－59:不及格
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入五分制分数：");
		int scores;
		do{
			scores=scanner.nextInt();
		}while(scores<0||scores>5);{
			String [] grass={"不及格","不及格","不及格","及格","良","优"};
			System.out.println(grass[scores]);
		}

	}

}
