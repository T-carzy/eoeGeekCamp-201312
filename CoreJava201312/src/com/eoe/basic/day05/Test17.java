package com.eoe.basic.day05;

import java.util.Arrays;

public class Test17 {
	/**
	 * �������ݡ�����ʾ��
	 */
	public static void main(String[] args) {
		int[] a=new int[0];//����һ��������
		//����a����
		a=Arrays.copyOf(a, a.length+1);
		a[0]=100;
		System.out.println("���ݺ������a:"+Arrays.toString(a));
		//����a����
		a=Arrays.copyOf(a, a.length-1);
		System.out.println("���ݺ������a:"+Arrays.toString(a));
	}
}
