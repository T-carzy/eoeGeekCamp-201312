package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Leapyear {

	/**��֪���������
	 * ��400�ı���������4�ı���������100�ı���
	 * ����������ݣ���ʾ�����껹��ƽ��
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ݣ�");
		int year = scanner.nextInt();
		if((year%400==0||year%4==0)&&year%100!=0){  /*�ж��Ƿ�������*/
			System.out.println("����������");
		}else{
			System.out.println("������ƽ��");
		}
		
		
	}

}
