package com.eoe.basic.day04;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score=-1;
		while(score<0 || score>5){
			System.out.println("����5���Ʒ���:");
			score=scanner.nextInt();
		}
		System.out.println("ok");
	}
}
