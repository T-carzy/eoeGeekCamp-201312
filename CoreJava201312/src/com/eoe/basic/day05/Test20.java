package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test20 {
	/**
	 * ɾ�������е�Ԫ��
	 */
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����","���","����"};
		System.out.println(Arrays.toString(names));
		Scanner scanner=new Scanner(System.in);
		System.out.println("����ɾ����λ��(1-"+names.length+")");
		int index;
		do{
			index=scanner.nextInt();
		}while(index<0 || index>names.length);
		for(int i=index;i<names.length-1;i++){
			names[i-1]=names[i];
		}
		names=Arrays.copyOf(names, names.length-1);
		System.out.println(Arrays.toString(names));
	}
}
