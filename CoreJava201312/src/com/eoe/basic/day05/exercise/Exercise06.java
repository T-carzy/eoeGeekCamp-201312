package com.eoe.basic.day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {
	/**
	 * ��������������Ϊ����
	 * int[] scores=new int[5]
	 * �������5������������Test24Ϊ��������ð�ݷ�ʽ��������
	 */
	public static void main(String[] args) {
		Random random=new Random();
		int[] scores=new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(100);
		}
		//��ӡ�����ԭʼֵ
		System.out.println(Arrays.toString(scores));
		//����С�ķ���������scores.length-1λ��
		for (int i = 0; i < scores.length-1; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//����ڶ�С�ķ���������scores.length-1λ��
		for (int i = 0; i < scores.length-2; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//������С�ķ���������scores.length-1λ��
		for (int i = 0; i < scores.length-3; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
		//�������С�ķ���������scores.length-1λ��
		for (int i = 0; i < scores.length-4; i++) {
			if(scores[i]<scores[i+1]){
				swap(scores,i,i+1);
			}
		}
		System.out.println(Arrays.toString(scores));
	}
	//swap()������������ֵ��������Ϊ������ͬʱ��������Ԫ�ص��±�
	static void swap(int b[],int i,int j){
		//����b[i]��b[j]��ֵ
		int c=b[i];
		b[i]=b[j];
		b[j]=c;
	}
}
