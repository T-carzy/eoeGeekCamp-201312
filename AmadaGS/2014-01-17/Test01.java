package com.ityw.sel.day04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(34);
		list.add(78);
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()){
			Integer i=iterator.next();
			System.out.println(i);
		}
	}

}
