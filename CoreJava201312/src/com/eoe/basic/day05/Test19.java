package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test19 {
	/**
	 * �������в���Ԫ��
	 */
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����","���"};
		//��ʾ����ǰ������
		System.out.println(Arrays.toString(names));
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������λ��(1-4)");
		int index;
		do{
			index=scanner.nextInt();
		}while(index<1 || index>4);
		//names������1
		names=Arrays.copyOf(names, names.length+1);
		//index-1~names.length-1��Ԫ�����κ���
		for (int i =names.length-1;i>=index; i--) {
			names[i]=names[i-1];
		}
		//��index-1λ�ò����µ�Ԫ��
		names[index-1]="����";
		//��ʾ����������
		System.out.println(Arrays.toString(names));
	}
}
