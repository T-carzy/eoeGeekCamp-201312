package com.eoe.basic.day05;

import java.util.Random;

public class Test09 {
	/**
	 * 随机产生10个60～100之间的分数，显示所有超过平均分的分数和下标。
	 */
	public static void main(String[] args) {
		int[] score=new int[10];
		Random random=new Random();
		int total=0;//总分
		//步骤1-随机产生10个分数，保存至数组中，并计算总分
		for (int i = 0; i < score.length; i++) {
			score[i]=random.nextInt(41)+60;
			total+=score[i];//总分累加
			//打印每个分数
			System.out.print(score[i]+"  ");
		}
		System.out.println();//输出空行
		//步骤2-计算平均分
		double avg=total/10.0;
		System.out.println("avg="+avg);
		//步骤3-查找超过平均分的分数和下标
		for (int i = 0; i < score.length; i++) {
			if(score[i]>avg){ //查找并打印超过平均分的分数和下标
				System.out.println(score[i]+":"+i);
			}
		}
	}
}
