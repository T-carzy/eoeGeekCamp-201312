package com.eoe.basic.day05;

import java.util.Arrays;

public class Test21 {
	/**
	 * ��֪���飺int[] a={50,40,30,20,10};
	      ������Ԫ���������ҵؽ������������
			a={10,20,30,40,50};
	      Ҫ����ʾ�м�Ľ������̣�������ʾ��
			[50, 40, 30, 20, 10]
			[40, 30, 20, 10, 50]
			[30, 20, 10, 40, 50]
			[20, 10, 30, 40, 50]
			[10, 20, 30, 40, 50]
	 */
	public static void main(String[] args) {
		int[] a={50,40,30,20,10};
		//��ӡ�����ԭʼֵ
		System.out.println(Arrays.toString(a));
		//��a[0]������a.length-1λ��
		for (int i = 0; i < a.length-1; i++) {
			int c=a[i];
			a[i]=a[i+1];
			a[i+1]=c;
		}
		System.out.println(Arrays.toString(a));
		//��a[0]������a.length-2λ��
		for (int i = 0; i < a.length-2; i++) {
			int c=a[i];
			a[i]=a[i+1];
			a[i+1]=c;
		}
		System.out.println(Arrays.toString(a));
		//��a[0]������a.length-3λ��
		for (int i = 0; i < a.length-3; i++) {
			int c=a[i];
			a[i]=a[i+1];
			a[i+1]=c;
		}
		System.out.println(Arrays.toString(a));
		//��a[0]������a.length-4λ��
		for (int i = 0; i < a.length-4; i++) {
			int c=a[i];
			a[i]=a[i+1];
			a[i+1]=c;
		}
		System.out.println(Arrays.toString(a));
	}

}
