package com.eoe.basic.day03;

import java.util.Scanner;

public class Test17 {
	/**
	 * ��������5���Ʒ������������±�׼�����ɼ��ȼ�
	 * 5�֣�����
	 * 4�֣�����
	 * 3�֣�����
	 * 0��2�֣�������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ʒ���");
		int score=scanner.nextInt();
		if(score<0 || score>5){
			System.out.println("�������");
			return ; //�˳�main()
		}
		if(score==5){
			System.out.println("����");
		}else if(score==4){
			System.out.println("����");
		}else if(score==3){
			System.out.println("����");
		}else{
			System.out.println("������");
		}

	}
}
