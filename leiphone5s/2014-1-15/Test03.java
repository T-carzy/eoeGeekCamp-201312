package com.eoe.oop.se1.day02;

import java.util.ArrayList;

public class Test03 {
static ArrayList<Integer> list,list2;
public static void main(String[] args) {
	initList();
	list2=new ArrayList<>();
	list2.add(list.get(0));
	list2.add(list.get(1));
	System.out.println("list��list2��ͬһ������"+(list==list2));
	System.out.println("list��list2������ͬ"+(list.equals(list2)));
	
}


private static void initList() {
	list=new ArrayList<>();
	list.add(new Integer(100));
	list.add(150);
	
}
}
