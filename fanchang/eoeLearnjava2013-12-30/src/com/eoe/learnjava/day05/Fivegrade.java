package com.eoe.learnjava.day05;
import java.util.Scanner;


public class Fivegrade {

	/**
	 * �������������,�����������,����������
	 * ֪��������ȷ
	 * @param args
	 */
	
	public static void main(String[] args) {
	    //do--whileѭ��д
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ������Ƶ���:");
//		int score;
//		do{
//			score= scanner.nextInt();	
//		}while(score<0||score>5);
//		System.out.println("������Ƶ���");
		
	    //��whileѭ����
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ������Ƶ���:");
//		int score=-1;
//		while(score<0||score>5){
//			score= scanner.nextInt();	
//		}
//		System.out.println("������Ƶ���");

		//��forѭ����
		Scanner scanner = new Scanner(System.in);
			System.out.println("������һ������Ƶ���:");
		int score=-1;
		for(;score<0||score>5;){
			score= scanner.nextInt();	
		}
		System.out.println("������Ƶ���");
	}
}
