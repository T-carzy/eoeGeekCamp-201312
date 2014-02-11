package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	static final int ADD_ACTION=1;//���ϵĲ�����
	static final int RETAIN_ACTION=2;//���ϵĽ�����
	static final int REMOVE_ALL_ACTION=3;//���ϵĲ����
	static final int TOARRAY_ACTION=4;
	static ArrayList<String> list,list2;
	public static void main(String[] args) {
		initList();
		System.out.println("1-���ϵĲ�");
		System.out.println("2-���ϵĽ�");
		System.out.println("3-���ϵĲ�");
		System.out.println("4-����ת��Ϊ����");
		int select=new Scanner(System.in).nextInt();
		switch (select) {
		case ADD_ACTION:
			list.addAll(list2);
			System.out.println(list);
			break;
		case RETAIN_ACTION:
			list.retainAll(list2);
			System.out.println(list);
			break;
		case REMOVE_ALL_ACTION:
			list.removeAll(list2);
			System.out.println(list);
			break;
		case TOARRAY_ACTION:
			String[] data=list.toArray(new String[list.size()]);
			System.out.println(Arrays.toString(data));
			break;
		}
	}
	private static void initList() {
		list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		list2=new ArrayList<String>();
		list2.add("b");
		list2.add("c");
		list2.add("d");
		System.out.println(list2);
	}
}
