package com.eoe.learnjava.day06;

import java.util.Scanner;

public class Monkey_guess {

	/**
	 * �����ֵ���Ϸ,�����������һ��0-99֮���������
	 * @param args
	 */
	public static void main(String[] args) {
		//��������
		int guessed=(int) (Math.random()*100);
		int guess=0;
		int count=0;
		
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("������һ��0-99֮�������:");
			guess = scanner.nextInt();
			if(guess>guessed){
				System.out.println("�´��˰�!");
			}else if(guess<guessed){
				System.out.println("��С�˰�");
			}
			count++;    //�Ʋ��˵Ĵ���
		}while (guess!=guessed);
		if(count==1){
			System.out.println("̫������,ż��~~");
		}else if(count==2){
			System.out.println("�ɵİ�!");
		}else if(count>=3&&count<=7){
			System.out.println("��ܶ������Ĳ���!");
		}else{
			System.out.println("�Ի�ˮ�˰�");
		}

	}

}
