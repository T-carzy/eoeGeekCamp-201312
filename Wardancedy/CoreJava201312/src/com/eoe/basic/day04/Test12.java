package com.eoe.basic.day04;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score;//��ʾ����ķ���
		do{
			System.out.println("����5���Ƶķ���");
			score=scanner.nextInt();
		}while(score<0 || score>5);
		System.out.println("����ok");
	}
}
