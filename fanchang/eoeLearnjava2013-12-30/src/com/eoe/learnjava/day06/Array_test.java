package com.eoe.learnjava.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array_test {

	/**
	 * ɾ���ַ����е�һ��Ԫ��,�����Ԫ�����ȱ,�������
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����","���"};
		Scanner scanner=new Scanner(System.in);
		int index;//����ɾ����λ��
		do{
			System.out.println("����ɾ����λ��(1-4)");
			index=scanner.nextInt();
		}while(index<1 || index>4);
		//��һ��Ԫ����ǰ����
		for(int i=index;i<=names.length-1;i++){
			names[i-1]=names[i];
		}
		//����1��names�������
		names=Arrays.copyOf(names, names.length-1);
		System.out.println(Arrays.toString(names));
	}

}
