package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test10 {
	static final int ADD_ACTION = 1;// 集合的并操作
	static final int RETAIN_ACTION = 2;// 集合的交操作
	static final int REMOVE_ALL_ACTION = 3;// 集合的差操作
	static final int TOARRAY_ACTION = 4;// 集合转换为数组
	static ArrayList<String> list1, list2;

	public static void main(String[] args) {
		initList();
		System.out.println("1-集合的并");
		System.out.println("2-集合的交");
		System.out.println("3-集合的差操作");
		System.out.println("4-集合转换为数组");
		int select = new Scanner(System.in).nextInt();
		switch (select) {
		case ADD_ACTION:
			list1.addAll(list2);
			System.out.println(list1);
			break;

		case RETAIN_ACTION:
			list1.retainAll(list2);
			System.out.println(list1);
			break;
		case REMOVE_ALL_ACTION:
			list1.removeAll(list2);
			System.out.println(list1);
			break;
		case TOARRAY_ACTION:
			String[] data = list1.toArray(new String[list1.size()]);
			System.out.println(Arrays.toString(data));
			break;
		}
	}

	private static void initList() {
		list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		System.out.println(list1);
		list2 = new ArrayList<String>();
		list2.add("b");
		list2.add("c");
		list2.add("d");
		System.out.println(list2);

	}
}
