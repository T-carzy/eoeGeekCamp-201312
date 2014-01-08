package com.eoe.basic.day05;

import java.util.Random;

public class Test15 {
	/**
	 * ����ѭ����ֵ��System.arraycopy��ֵ��Ч��
	 */
	public static void main(String[] args) {
		Random random = new Random();
		//����1�������������飬Ԫ�ظ���һǧ���
		double[] a = new double[10000000];
		double[] b = new double[10000000];
		//�����ֵ������a��ֵ
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100000);
		}
		//���㣺ͨ��ѭ������Ԫ�����θ�ֵ��ʱ��
		long start = System.currentTimeMillis();
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		long end = System.currentTimeMillis();
		System.out.println("cost=" + (end - start));
		//����System.arraycopy()��ʽ��ֵ��ʱ��
		start = System.currentTimeMillis();
		System.arraycopy(a, 0, b, 0, a.length);
		end = System.currentTimeMillis();
		System.out.println("cost=" + (end - start));
	}

}
