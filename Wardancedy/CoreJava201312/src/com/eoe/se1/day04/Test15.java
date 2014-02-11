package com.eoe.se1.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test15 {
	public static void main(String[] args) {
		String[] names=new String[]{"a","bb","ccc"};
		List<String> list=Arrays.asList(names);
		//System.out.println(list);
		//list.set(0, "уе╥и");
		//System.out.println(list.get(0));
		ArrayList<String> list2=new ArrayList<String>(list);
		//list2.remove(0);
		//System.out.println(list2);
		
		ListIterator<String> iterator=list2.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("************");
		while(iterator.hasPrevious()){
			String name=iterator.previous();
			System.out.println(name);
		}
	}
}
