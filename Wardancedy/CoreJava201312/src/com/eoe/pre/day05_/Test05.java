package com.eoe.pre.day05_;

import java.util.Arrays;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] scores;//�����һ�ֶ��巽ʽ����ջ�ռ����������������
		int scores2[];//����ĵڶ��ֶ��巽ʽ��c���
		int[] scores3=new int[5];
		//����Ķ�̬��ʼ��
		int[] scores4=new int[]{85,77,93,62,90};
		//����ľ�̬��ʼ��
		int[] scores5={85,77,93,62,90};
		String text="abcdefg";
		//System.out.println(text.length());
		System.out.println(scores5.length);
		for (int i = 0; i < scores5.length; i++) {
			System.out.println(scores5[i]);
		}
		//��ѭ��������������Ԫ�ز���ӡ
		for(int i=0;i<scores5.length;i++){
			System.out.println(scores5[i]);
		}
		System.out.println(Arrays.toString(scores5));
		int[] scores6={};//���������
		int[] scores7=new int[0];
		//a(new int[]{85,77,93,62,90});
	}
	static void a(int[] scores){
		System.out.println(scores[0]);
	}
}
