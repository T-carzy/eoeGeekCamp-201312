package com.eoe.basic.day04.exercise;

import java.util.Scanner;

public class Exercise05 {
	/*
	 * *7������ͨ����������һ��0��99֮���������
	 * �õ����ö��ֲ��ҷ��ҵ�������
	�ļ�����Exercise06.java  
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����Ҫ�µ���:");
		int guessed=scanner.nextInt();
		int min=0;
		int max=99;
		int count=0;
		int guess=(min+max)/2;//�м��������ֲ���
		boolean find=false;//�����Ƿ�µ���true���µ�
		while(!find){
			System.out.println(guess);
			count++;//ͳ�Ʋ��Ҵ���
			if(guess==guessed){
				find=true;
			}else if(guess<guessed){
				//  65  49
				// 50-99
				min=guess;//�����½�Ϊguess
			}else{
				//32 49   0-49
				max=guess;//�����Ͻ�Ϊguess
			}
			guess=(min+max)/2;
		}
		System.out.println(guess+"��������"+count+"��");
	}
}
