package com.eoe.basic.day05;

import java.util.Random;


public class Test10 {
	/**
	 * �������10��60��100֮��ķ������ҳ���߷֡�
	 */
	public static void main(String[] args) {
		Random random=new Random();
		//����1-������� 10������������������
		int[] score=new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i]=random.nextInt(41)+60;
			System.out.print(score[i]+"  ");
		}
		/*����2-����߷�
		 * ѡ������ķ�ʽ������߷ֽ�����score[0]
		 */
		for(int j=1;j<score.length;j++){
			if(score[0]<score[j]){
				//����score[0]��scoe[j]
				int t=score[0];
				score[0]=score[j];
				score[j]=t;
			}
		}
		System.out.println("��߷֣�"+score[0]);
	}
}
