package com.eoe.sel.day04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			Iterator<Integer> iterator=list.iterator();
			while(iterator.hasNext()){
				Integer i=iterator.next();
				System.out.println(i);
			}
	}

}
