package com.eoe.pre.day01;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Test06 {

	/**
	 * ctlr+/:����ע����ѡ����
	 */
	public static void main(String[] args) {
		//�����������
//		int score=60;
//		System.out.println("score="+score);
		//����һ�����ڼ�������Ķ���
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������:");
		int score=scanner.nextInt();
		if(score>=60){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		/*
		 *   ���ʽ1 < ���ʽ2   :С������
		 *   ���ʽ1 > ���ʽ2   :��������
		 *   ���ʽ1 <= ���ʽ2   :С�ڵ�������
		 *   ���ʽ1 >= ���ʽ2   :���ڵ�������
		 *   ���ʽ1 == ���ʽ2   :��������
		 *   ���ʽ1 != ���ʽ2   :����������
		 */
	}

}
