package com.eoe.basic.day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise05 {
	/**
	 * �������5��60��100֮��ķ�������������
	 */
	public static void main(String[] args) {
		Random random = new Random();
		// ����1-������� 5������������������
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(41) + 60;
			System.out.print(score[i] + "  ");
		}
		System.out.println();
		/*
		 * ����2-����߷� ѡ������ķ�ʽ������߷ֽ�����score[0]
		 */
		for (int j = 1; j < score.length; j++) {
			if (score[0] < score[j]) {
				// ����score[0]��scoe[j]
				int t = score[0];
				score[0] = score[j];
				score[j] = t;
			}
		}
		// �ŵڶ��߷�
		for (int j = 2; j < score.length; j++) {
			if (score[1] < score[j]) {
				// ����score[0]��scoe[j]
				int t = score[1];
				score[1] = score[j];
				score[j] = t;
			}
		}
		// �ŵ����߷�
		for (int j = 3; j < score.length; j++) {
			if (score[2] < score[j]) {
				// ����score[0]��scoe[j]
				int t = score[2];
				score[2] = score[j];
				score[j] = t;
			}
		}
		// �ŵ��ĸ߷�
		for (int j = 4; j < score.length; j++) {
			if (score[3] < score[j]) {
				// ����score[0]��scoe[j]
				int t = score[3];
				score[3] = score[j];
				score[j] = t;
			}
		}
		System.out.println(Arrays.toString(score));
	}
}
