package com.eoe.learnjava.day07;

import java.util.Random;

public class Top_score {

	/**
	 * ���60-100��10����,�ҳ���߷�
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int[] score = new int[10];
		//����10�������,���浽������
		for (int i = 0; i < score.length; i++) {
			score[i]=random.nextInt(40)+60;
			System.out.print(score[i]+" ");
		}
		System.out.println();
		//�ҳ���߷�
		for (int i = 0; i < score.length-1; i++) {
			if (score[0]<score[i+1]) {
				swap(score,0,i+1);
			}
		}
		System.out.println(score[0]);
	}
	//����
	static void swap(int[] a,int i,int j){
		int c=a[i];
		a[i]=a[j];
		a[j]=c;
	}

}
