package com.eoe.learnjava.day06;

import java.util.Arrays;
import java.util.Random;

public class Sotr_test {
	public static void main(String[] args) {
		Random random=new Random();
		int[] scores=new int[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(41)+60;
			System.out.print(scores[i]+" ");
		}
		//ȫ������
		for (int j = 0; j < scores.length-1; j++) {
			for (int i = 1+j; i < scores.length; i++) {
				if(scores[j]<scores[i]){
					//����scores[0]��scores[i]
					int temp=scores[j];
					scores[j]=scores[i];
					scores[i]=temp;
				}
			}
		}
//		//����߷ֽ�����scores[0]
//		for (int i = 1; i < scores.length; i++) {
//			if(scores[0]<scores[i]){
//				//����scores[0]��scores[i]
//				int temp=scores[0];
//				scores[0]=scores[i];
//				scores[i]=temp;
//			}
//		}
//		//�ڶ��������
//		for (int i = 2; i < scores.length; i++) {
//			if(scores[1]<scores[i]){
//				//����scores[1]��scores[2]
//				int temp=scores[1];
//				scores[1]=scores[i];
//				scores[i]=temp;
//			}
//		}
//		//�����������
//		for (int i = 3; i < scores.length; i++) {
//			if(scores[2]<scores[i]){
//				//����scores[2]��scores[3]
//				int temp=scores[2];
//				scores[2]=scores[i];
//				scores[i]=temp;
//			}
//		}
		System.out.println();
		System.out.println(Arrays.toString(scores));
	}
}

