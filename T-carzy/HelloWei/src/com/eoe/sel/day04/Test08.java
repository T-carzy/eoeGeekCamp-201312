package com.eoe.sel.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test08 {
	public static void main(String[] args) {
			List<Integer> list =new ArrayList<Integer>();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			ListIterator<Integer> it=list.listIterator();
			while(it.hasNext()){
				System.out.println(it.next()+" ");
			}
			System.out.println();
			while(it.hasPrevious()){
				System.out.println(it.previous()+" ");
			}
}
}
