package com.eoe.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test03 {


	public static void main(String[] args) {
//		ArrayList<Integer> list=new ArrayList<Integer>();
////		ArrayList<String> names2=new ArrayList<String>();
//		list.add(0);
//		list.add(2);
//		list.add(4);
//		list.remove(2);
////		ArrayList<String>names=null;
////		names.add("a");
////		names.add("b");
////		names.add("c");
////		names.add("d");
//		System.out.println(list);
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		map.put(0, 100);
		map.put(0, 1);

		System.out.println(map.get(0));
	}

}
