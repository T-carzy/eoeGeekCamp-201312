package com.eoe.basic.day05;

import java.util.Scanner;

public class Test08 {
	/**
	 * ��֪����ѧ����������������������������ѧ��������
		�ŷ�,���ƣ�����ơ����ȣ����
	 */
	public static void main(String[] args) {
		String[] names={
			"�ŷ�","����","�����","����","���"
		};
		Scanner scanner=new Scanner(System.in);
		System.out.println("name=");
		String name=scanner.next();
		for(int i=0;i<names.length;i++){
			if(names[i].equals(name)){
				System.out.println(name+"��ѧ�ţ�"+i);
			}
		}
	}
}
