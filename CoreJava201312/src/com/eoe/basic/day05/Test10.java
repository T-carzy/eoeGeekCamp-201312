package com.eoe.basic.day05;

import java.util.Random;


public class Test10 {
	/**
	 * 随机产生10个60～100之间的分数，找出最高分。
	 */
	public static void main(String[] args) {
		Random random=new Random();
		//步骤1-随机产生 10分数，保存至数组中
		int[] score=new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i]=random.nextInt(41)+60;
			System.out.print(score[i]+"  ");
		}
		/*步骤2-找最高分
		 * 选择排序的方式：将最高分交换到score[0]
		 */
		for(int j=1;j<score.length;j++){
			if(score[0]<score[j]){
				//交换score[0]和scoe[j]
				int t=score[0];
				score[0]=score[j];
				score[j]=t;
			}
		}
		System.out.println("最高分："+score[0]);
	}
}
