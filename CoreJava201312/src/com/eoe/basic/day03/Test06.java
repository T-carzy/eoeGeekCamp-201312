package com.eoe.basic.day03;

import java.util.Scanner;

public class Test06 {
	/**
	 * switch���ʾ��
	 * ��������һ��5���Ƶķ����������������ֱ�׼�����ɼ��ĵȼ�
	 * 5�֣�����
	 * 4�֣�����
	 * 3�֣�����
	 * 0��2��������
	 */
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("����5���Ƶķ���");
		 int score=scanner.nextInt();
		 switch (score) {
		case 5:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("����Ĳ���5���Ƶķ���");
			break;
		}

	}
}
