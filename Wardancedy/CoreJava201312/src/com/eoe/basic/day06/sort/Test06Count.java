package com.eoe.basic.day06.sort;

import java.util.Arrays;
import java.util.Random;
/**
 * �������򣭲������������
 * �������������͵����ݣ�����ȡֵ��Χ��̫��
 * �㷨�ص㣺
 * 	  ������aԪ�ص�ֵ��Ϊ����bԪ�ص��±꣬����bԪ�ص�ֵ�Ǹ÷�ֵ�ظ����ֵĴ�����
 *   �����ʱ�临�Ӷȣ�O(n)
 */
public class Test06Count {
	public static void main(String[] args) {
		int[] a=new int[20];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(11);
		}
		System.out.println(Arrays.toString(a));
		int[] b=new int[11];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		for (int i = b.length-1; i >=0; i--) {
			for(int j=1;j<b[i];j++){
				System.out.print(i+" ");
			}
		}
	}
}
