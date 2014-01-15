package com.eoe.sel.day02;

import java.util.ArrayList;

public class Test04 {
		static ArrayList<Integer>list1,list2;
	public static void main(String[] args) {
		initList();
		list2=new ArrayList<>();
		list2.add(list1.get(0));
		list2.add(list1.get(1));
		System.out.println("list1与list2是同一个集合对象"+(list1==list2));
		System.out.println("list1与list2的数据相同"+list1.equals(list2));
		}
	private static void initList() {
			list1=new ArrayList<Integer>();
			list1.add(new Integer(2222));
			list1.add(1111);
	}

}
