package com.eoe.learnjava.day06;

import java.util.Random;

public class Rand_number {

	/**
	 * �������10������(��60-100֮��),�ҳ������
	 * ˼·:
	 * 1.��Ҫѭ��10��,��for
	 * 2.����max��������
	 * 3.���������
	 * 4.�ж�
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int max=Integer.MIN_VALUE;
		int score;
		for(int i=0;i<10;i++){
			score=random.nextInt(41)+60;
			System.out.println(score);
			if(score>max){
				max=score;
			}
		}
		System.out.println("�����:"+max);

	}

}
