package com.eoe.oop.day02;

import java.util.Arrays;

public class Test10_ {
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����"};
		printNames("ʵ��Ϊ�ַ�������", names);
		printNames("ʵ��Ϊ���ɸ��ַ���","�ŷ�","����","�����","��� ");
	}
	//��ӡһ����������һ������������������Դ���ڶ��������ǿɱ�������ɽ��ն���ַ�����������
	static void printNames(String descript,String... names){
		System.out.println(descript);
		System.out.println(Arrays.toString(names));
		for(String name:names){
			System.out.println(name);
		}
		System.out.println();
	}
}
