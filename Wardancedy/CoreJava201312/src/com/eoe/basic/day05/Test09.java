package com.eoe.basic.day05;

import java.util.Random;

public class Test09 {
	/**
	 * �������10��60��100֮��ķ�������ʾ���г���ƽ���ֵķ������±ꡣ
	 */
	public static void main(String[] args) {
		int[] score=new int[10];
		Random random=new Random();
		int total=0;//�ܷ�
		//����1-�������10�������������������У��������ܷ�
		for (int i = 0; i < score.length; i++) {
			score[i]=random.nextInt(41)+60;
			total+=score[i];//�ܷ��ۼ�
			//��ӡÿ������
			System.out.print(score[i]+"  ");
		}
		System.out.println();//�������
		//����2-����ƽ����
		double avg=total/10.0;
		System.out.println("avg="+avg);
		//����3-���ҳ���ƽ���ֵķ������±�
		for (int i = 0; i < score.length; i++) {
			if(score[i]>avg){ //���Ҳ���ӡ����ƽ���ֵķ������±�
				System.out.println(score[i]+":"+i);
			}
		}
	}
}
