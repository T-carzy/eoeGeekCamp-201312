package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int value;
		do{
		System.out.println("������һ����λ��:");
		value=scanner.nextInt();
		}while(value<100||value>1000);
		int i=value%10;//�����λ
		int j=(value-i)/10%10;//���ʮλ
		int k=value/100;//�����λ
		if(i*i*i+j*j*j+k*k*k==value){
			System.out.println(value+"��һ��ˮ�ɻ���");
		}else{
			System.out.println(value+"����ˮ�ɻ���");
		}
		}
	}
