package com.eoe.basic.day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {
	/**
	 * 创建以下数组作为分数
	 * int[] scores=new int[5]
	 * 随机产生5个分数，用以Test24为基础，用冒泡方式降序排序。
	 */
	public static void main(String[] args) {
		Random random=new Random();
		int[] scores=new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(100);
		}
		//打印数组的原始值
		System.out.println(Arrays.toString(scores));
		//将最小的分数移至到scores.length-1位置
		for (int i = 0; i < scores.length-1; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//将最第二小的分数移至到scores.length-1位置
		for (int i = 0; i < scores.length-2; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//将第三小的分数移至到scores.length-1位置
		for (int i = 0; i < scores.length-3; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//将最第四小的分数移至到scores.length-1位置
		for (int i = 0; i < scores.length-4; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
	}
	//swap()交换两个变量值，数组作为参数，同时接收两个元素的下标
	static void swap(int b[],int i,int j){
		//交换b[i]和b[j]的值
		int c=b[i];
		b[i]=b[j];
		b[j]=c;
	}
}
