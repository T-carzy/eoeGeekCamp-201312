package com.eoe.learnjava.day07;


import java.util.Arrays;
import java.util.Scanner;

public class Interposition {

	/**
	 * ���������Ԫ��
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		String[] names={"�Է�","����","�����","���"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("������1-4����:");
		int index;
		do {
			index=scanner.nextInt();			
		} while (index<1||index>5);
		//��������
		names=Arrays.copyOf(names, names.length+1);
		for (int i = names.length-1; i > index-1; i--) {
			swap(names,i-1,i);
		}
		names[index-1]="����";
		System.out.println(Arrays.toString(names));
	}
		

//    //ɾ������Ԫ��
//	String[] names={"�Է�","����","�����","���"};
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("������1-4����:");
//	int index;
//	do {
//		index=scanner.nextInt();			
//	} while (index<1||index>5);
//	for (int i = index-1; i < names.length-1; i++) {
//		swap(names,i,i+1);
//	}
//	//�������
//	names=Arrays.copyOf(names, names.length-1);
//	System.out.println(Arrays.toString(names));
//	}
	
	//��������ֵ
	static void swap(String[] a,int i,int j){
		String c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
}
