package com.eoe.se1.day05;

import java.util.Scanner;

public class Test14 {
	public enum Season_1{
		SPRING,SUMMER,AUTUN,WINTER;
	}
	public static void main(String[] args) {
		Season_1 season;
		System.out.println("1-����");
		System.out.println("2-����");
		System.out.println("3-����");
		System.out.println("4-����");
		int index=new Scanner(System.in).nextInt();
		season=Season_1.values()[index-1];
		switch (season) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUN:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		}
	}
}
