package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test06 {

	/**
	 * �����ж�����5���Ƶķ��������ɼ��ȼ���
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score;
		do{
			System.out.println("scores=");
			score=scanner.nextInt();
		}while(score<0 || score>5);
		/*   0,    1,     2     3    4     5
		 * ������ ������ ������ ����     ����   ����
		 */
		String[] grades={"������","������","������",
				"����","����","����"};
		System.out.println(grades[score]);
		//�����·ݣ���ʾ����
	}

}
