package com.eoe.pre.day06_.sort;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 65, 97, 49, 38 };
		System.out.println(Arrays.toString(a));
//		int i=1;
//		// �����ֵ�������������
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		i++;//i=2
//		System.out.println(Arrays.toString(a));
//		// ���ڶ���ֵ����������ĵ����ڶ���Ԫ�ص�λ��
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		i++;//i=3
//		// ��������ֵ����������ĵ���������Ԫ�ص�λ��
//		for (int j = 0; j < a.length - i; j++) {
//			if (a[j] > a[j + 1]) {
//				int temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++){
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
