package com.eoe.pre.day05_;

import java.util.Arrays;
import java.util.Random;

import com.eoe.tools.MyTools;

public class Test08 {

	/**
	 * �������10��[60,100]�ķ�������ʾ���г���ƽ���ֵ�
	 * �������±ꡣ
	 */
	public static void main(String[] args) {
		int[] scores=new int[10];
		Random random=new Random();
		double sumScore=0;//�ܷ�
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(41)+60;
			sumScore+=scores[i];
		}
		System.out.println(Arrays.toString(scores));
		double avg=sumScore/scores.length;
		System.out.println("ƽ����="+MyTools.pround(avg, 1));
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>=avg){
				System.out.println(scores[i]);
			}
		}
		
	}

}
