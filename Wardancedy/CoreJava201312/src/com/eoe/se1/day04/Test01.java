package com.eoe.se1.day04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(90);
		list.add(85);
//		for(Integer i:list){
//			System.out.println(i);
//		}
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()){
			Integer i=iterator.next();
			System.out.println(i);
		}
	}
}
