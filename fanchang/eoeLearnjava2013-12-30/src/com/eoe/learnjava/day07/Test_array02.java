package com.eoe.learnjava.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Test_array02 {

	/**
	 * ����һ����ĸ,ͳ�Ƹ���ĸ��Ӣ���г��ֵ�λ��
	 * father mother we are family
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text="father mother we are family";
		System.out.println("������һ���ַ�:");
		char c=scanner.next().charAt(0);
		int[] position={};
		for (int i = 0; i < text.length(); i++) {
			if (c==text.charAt(i)) {
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
