package com.eoe.basic.day05;

import java.util.Scanner;

public class Test07 {
	/*�ֳ���̣�����ٷ��Ƶķ�����
	 * 100~90:����
	 * 89-80:����
	 * 79-70:�е�
	 * 69-60:����
	 * 0��59:������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ƶķ�����");
		int score;
		do{
			score=scanner.nextInt();
		}while(score<1 || score>5);
		String[] grades={
			"������","������","������","����","����","����"
		};
		System.out.println(grades[score]);		
	}

}
