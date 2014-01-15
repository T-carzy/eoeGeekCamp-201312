package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class Test07 {
static ArrayList<Integer>list1,list2;
public static void main(String[] args) {
	initList();
	list2=list1;
	list2.add(list1.get(0));
	list2.add(list1.get(1));
	System.out.println("list1与list2是同一个集合的对象："+(list1==list2));
	System.out.println("list1与list2的数据相同:"+list1.equals(list2));
}
private static void initList() {
	list1=new ArrayList<Integer>();
	list1.add(new Integer(100));
	list1.add(300);
}
}
