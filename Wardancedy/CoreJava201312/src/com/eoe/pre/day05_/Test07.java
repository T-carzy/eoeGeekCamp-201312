package com.eoe.pre.day05_;

import java.util.Scanner;

public class Test07 {

	/**
	 *��֪����ѧ����������������������������ѧ��������
                  �ŷ�,���ƣ�����ƣ����ȣ����

	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] names={"�ŷ�","����","�����","����","���"};
		System.out.println("��������:");
		String name=scanner.next();
		for (int i = 0; i < names.length; i++) {
			if(name.equals(names[i])){
				System.out.println(i);
				break;
			}
		}
	}

}
