package com.eoe.learnjava.day07;

import java.util.Scanner;

public class Grade {

	/**
	 * �����ж���������Ƶķ��������ɼ��ȼ�
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		int score;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ������Ƶ���:");
//		do {
//			score = scanner.nextInt();
//		} while (score<0||score>5);
//		String[] grades={"������","������","������","����","����","����"};
//		System.out.println(grades[score]);
//	}

		
		//�����ж��������0-100����,�жϷ����ȼ�
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ٷ��Ƶ���:");
		do {
			score = scanner.nextInt();
		} while (score<0||score>100);
		String[] grades={"������","������","������","������","������","������",
				"����","�е�","����","����"};
		System.out.println(grades[score/10]);
		}
}
