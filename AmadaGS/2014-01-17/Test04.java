package com.ityw.sel.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test04 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(67);
		list.add(56);
		list.add(34);
		list.add(12);
		ListIterator<Integer> iterator=list.listIterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		System.out.println("#######");
		while(iterator.hasPrevious()){
			System.out.print(iterator.previous()+"  ");
		}
	}

}
