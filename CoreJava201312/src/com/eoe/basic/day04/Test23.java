package com.eoe.basic.day04;

import java.util.Random;
import java.util.Scanner;

public class Test23 {
	/**
	 *������Ϸ�������������һ��0-99֮���������
	 *������������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//�������������0-99֮�������
		int guessed=new Random().nextInt(100);
		int guess;//�����˲µ���
		int count=0;
		do{
			count++;
			System.out.print("�°�:");
			guess=scanner.nextInt();
			if(guess<guessed){
				System.out.println("��С��");
			}else if(guess>guessed){
				System.out.println("�´���");
			}else{
				System.out.println("�¶���!");
				break;
			}
		}while(true);
		if(count==1){
			System.out.println("ż��ǩ���ְɣ�");
		}else if(count==2){
			System.out.println("�ɵİɣ�");
		}else if(count<=7){
			System.out.println("��ܶ��ز�������");
		}else{
			System.out.println("�Ի�ˮ��!");
		}
	}
}
