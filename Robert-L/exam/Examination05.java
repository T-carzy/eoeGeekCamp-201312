package com.eoe.exam;

import java.util.Arrays;
import java.util.Random;

public class Examination05 {
	/**
	 * ��̶����������10000��(0,200)֮����������н������� ��ʾ������ѡ��ð�ݡ�ѡ�񡢲�����㷨��������ʹ��Arrays.sort()��
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10000];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(201);
		}
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
