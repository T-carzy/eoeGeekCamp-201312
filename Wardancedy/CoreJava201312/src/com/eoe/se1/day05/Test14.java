package com.eoe.se1.day05;

import java.util.Scanner;

public class Test14 {
	public enum Season_1{
		SPRING,SUMMER,AUTUN,WINTER;
	}
	public static void main(String[] args) {
		Season_1 season;
		System.out.println("1-春天");
		System.out.println("2-夏天");
		System.out.println("3-秋天");
		System.out.println("4-冬天");
		int index=new Scanner(System.in).nextInt();
		season=Season_1.values()[index-1];
		switch (season) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
	}
}
