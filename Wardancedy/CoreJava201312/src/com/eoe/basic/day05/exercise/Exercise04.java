package com.eoe.basic.day05.exercise;

import java.util.Scanner;

public class Exercise04 {

	/**
	 * �����ж���䣬����ٷ��Ƶķ������������±�׼���������ȼ���
	   90��100:����
	   89-80:����
	   79-70:�е�
	   69-60:����
	   0��59:������

	 */
	public static void main(String[] args) {
		String[] grade={
			"������","������","������","������","������","������",
			"����","�е�","����","����","����"
		};
		Scanner scanner=new Scanner(System.in);
		System.out.print("�������:");
		int score;
		do{
			score=scanner.nextInt();
		}while(score<0 || score>100);
		System.out.println(grade[score/10]);
	}

}
