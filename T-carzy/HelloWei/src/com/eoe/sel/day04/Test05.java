package com.eoe.sel.day04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test05 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("**************");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			Integer i=it.next();
			System.out.println(i);
		}
	}
		
}
