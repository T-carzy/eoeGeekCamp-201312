package com.eoe.se1.day02;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("�ŷ�");
		names.add("����");
		names.add("�����");
		names.add(0, "����");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for(String name:names){
			System.out.println(name);
		}
		System.out.println(names);
		/*
		 * 1.�ڱ���Ļ����϶����ϼ��Ͻ���ɾ��ĳ��Ԫ�ء��޸�ĳ��Ԫ�صĲ���
		   2.�����������Ԫ�أ����ǰ�жϼ��Ϸǿա�
		   3.��������һ���������ж��Ƿ��Ǽ����е�ĳ�ˡ�
		 * 
		 */
		
	}
}
