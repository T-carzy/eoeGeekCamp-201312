package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test18 {
	/** 
	 * ����һ����ĸ��ͳ�Ƹ���ĸ������Ӣ���г��ֵ�����λ��
	 * father mother we are family
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String text="father mother we are family";
		System.out.print("����һ���ַ�:");
		char c=scanner.next().charAt(0);
		//����һ�������飬����ͳ�Ƹ��ַ����ַ����г��ֵ�����λ��
		int[] position={};
		 for (int i = 0; i < text.length(); i++) {
			if(c==text.charAt(i)){
				//����position������1
				position=Arrays.copyOf(position, position.length+1);
				//�����������Ԫ���м�¼�ַ�c���ַ���text�г��ֵ�λ��
				position[position.length-1]=i;
			}
		}
		//��ʾ����position������Ԫ��ֵ
		System.out.println(Arrays.toString(position));
	}

}
