package com.eoe.pre.day02;

import java.util.Arrays;
import java.util.Random;

public class Test03 {

	/**
	 * �������10��������ͳ��ƽ���ֺͳ���ƽ���ֵķ���
	 */
	public static void main(String[] args) {
		int[] scores=new int[10];
		Random random=new Random();
		int total=0;//�����ܷ�
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(41)+60;//[0,101)
			//System.out.print(scores[i]+"  ");
			total+=scores[i];
		}
		System.out.println(Arrays.toString(scores));
		double avg=total/scores.length;
		System.out.println();
		System.out.println("ƽ����"+avg);
//		for (int i = 0; i < scores.length; i++) {
//			if(scores[i]>=avg){
//				System.out.println(scores[i]);
//			}
//		}
		//foreach
		for(int score:scores){
			if(score>=avg){
				System.out.println(score);
			}
		}
	}

}
