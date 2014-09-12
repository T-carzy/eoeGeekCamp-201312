package com.eoe.se1.day02;

import java.util.ArrayList;

public class Test03 {
	static ArrayList<Integer> list,list2;
	public static void main(String[] args) {
		initList();
//		list2=list;
//		System.out.println("list与list2是同一个集合对象:"+(list==list2));
		list2=new ArrayList<Integer>();
		list2.add(list.get(0));
		list2.add(list.get(1));
		System.out.println("list与list2是同一个集合对象:"+(list==list2));
		System.out.println("list与list2的数据相同："+list.equals(list2));
		
	}
	private static void initList() {
		list=new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(300);
	}
}
