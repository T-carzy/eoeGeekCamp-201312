package com.eoe.se1.day02;

import java.util.ArrayList;

import com.eoe.se1.day02.Test04.Integer_;
public class ArrayList {
	static ArrayList<Integer_> list;
	static ArrayList<Integer_> list2;
	public static void main(String[] args) {
		initList();
		list2=list;
		System.out.println("list="+list);
		System.out.println("list2="+list2);
		System.out.println("list与list2的数据相同："+list.equals(list2));
		System.out.println("list与list2是同一个集合对象:"+(list==list2));
		list2=new ArrayList<Integer_>();
		for(int i=0;i<list.size();i++){
			list2.add(list.get(i));
		}
		System.out.println("list2="+list2);
//		list2.add(list.get(0));
//		list2.add(list.get(1));
		System.out.println("list与list2是同一个集合对象:"+(list==list2));
		System.out.println("list与list2的数据相同："+list.equals(list2));
		list.set(0, new Integer_(150));
		System.out.println("list="+list);
		System.out.println("list2="+list2);
		System.out.println();
		Integer_ i=list.get(0);
		i.value=250;
		list.set(0, i);
		System.out.println("list="+list);
		System.out.println("list2="+list2);
		
	}
	private static void initList() {
		list=new ArrayList<Integer_>();
		list.add(new Integer_(100));
		list.add(new Integer_(300));
	}
}
