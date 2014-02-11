package com.eoe.basic.day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise05 {
	/**
	 * 随机产生5个60～100之间的分数，降序排序。
	 */
	public static void main(String[] args) {
		Random random = new Random();
		// 步骤1-随机产生 5分数，保存至数组中
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(41) + 60;
			System.out.print(score[i] + "  ");
		}
		System.out.println();
		/*
		 * 步骤2-找最高分 选择排序的方式：将最高分交换到score[0]
		 */
		for (int j = 1; j < score.length; j++) {
			if (score[0] < score[j]) {
				// 交换score[0]和scoe[j]
				int t = score[0];
				score[0] = score[j];
				score[j] = t;
			}
		}
		// 排第二高分
		for (int j = 2; j < score.length; j++) {
			if (score[1] < score[j]) {
				// 交换score[0]和scoe[j]
				int t = score[1];
				score[1] = score[j];
				score[j] = t;
			}
		}
		// 排第三高分
		for (int j = 3; j < score.length; j++) {
			if (score[2] < score[j]) {
				// 交换score[0]和scoe[j]
				int t = score[2];
				score[2] = score[j];
				score[j] = t;
			}
		}
		// 排第四高分
		for (int j = 4; j < score.length; j++) {
			if (score[3] < score[j]) {
				// 交换score[0]和scoe[j]
				int t = score[3];
				score[3] = score[j];
				score[j] = t;
			}
		}
		System.out.println(Arrays.toString(score));
	}
}
