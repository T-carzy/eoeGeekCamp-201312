package com.eoe.basic.day05;

import java.util.Arrays;

public class Test22 {
	/**
	 * ��д����swap��������������ֵ�����Ը÷����Ľ������
	 * �ܷ�Ӱ����ô��ı�����
	 */
	public static void main(String[] args) {
		int[] a={50,40,30,20,10};
		//��ӡswap()����ǰ�����ֵ
		System.out.println("swap()����ǰ������a��ֵ"+Arrays.toString(a));
		swap(a[0],a[1]);//��a[0]��a[1]��ֵ���ݸ�swap()
		//��ӡswap()���ú������ֵ
		System.out.println("swap()���ú�����a��ֵ"+Arrays.toString(a));
	}
	//swap()������������ֵ
	static void swap(int a1,int a2){
		int c=a1;
		a1=a2;
		a2=c;
	}
}
