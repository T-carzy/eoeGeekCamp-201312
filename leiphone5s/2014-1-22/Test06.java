package se2.day01;

import java.util.Scanner;

public class Test06 {
	public enum Season_1 {
		SPRING, SUMMER, AUTUN, WINTER;
	}

	public static void main(String[] args) {
		Season_1 season;
		AAA: while (true) {
			System.out.println("������һ������:");
			System.out.println("1-����");
			System.out.println("2-����");
			System.out.println("3-����");
			System.out.println("4-����");
			int index = new Scanner(System.in).nextInt();
			season = Season_1.values()[index - 1];
			switch (season) {
			case SPRING:
				System.out.println("����");
				continue AAA;
			case SUMMER:
				System.out.println("����");
				continue AAA;
			case AUTUN:
				System.out.println("����");
				continue AAA;
			case WINTER:
				System.out.println("����");
				continue AAA;
			}
		}
	}
}