package com.eoe.basic.day04;

import java.util.Scanner;

public class Test16 {

	/**
	 * ��ѭ��������2n��n��ֵ�ɼ������롣
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		//2*2*2*2
		double result=1;//���������
//		int i=1;
//		result*=2;//result=result*2; 2��1�η� 2
//		i++;//i=2;
//		result*=2;//result=2*2;  2��2�η�
//		i++;//i=3;
//		result*=2;//result=2*2*2; 2�Ĵη�
		/*����ѭ����д��
		 * 1.ѭ�������ĳ�ʼֵ  
		 * 2.ѭ������ֵ�ı��
		 * 3.ѭ������
		 * 4.ѭ������������
		 */
		for(int i=1;i<=n;i++){
			result*=2;
		}
		System.out.println(2+"��"+n+"�η�="+result);
	}

}
