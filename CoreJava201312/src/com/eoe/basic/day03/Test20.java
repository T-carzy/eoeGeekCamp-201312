package com.eoe.basic.day03;

import java.util.Scanner;

public class Test20 {
	/**
	 * ��֪�������������
	 * ��400�ı���������4�ı���������100�ı�����
	 * ����������ݣ���ʾ�Ƿ����껹��ƽ�ꡣ
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������");
		int year=scanner.nextInt();
		if(year%400==0 || year%4==0&&year%100!=0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}		
	}
}
