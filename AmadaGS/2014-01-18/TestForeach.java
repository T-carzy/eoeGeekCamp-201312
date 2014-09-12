package com.eoe.weekday.Test;

import java.util.Iterator;
import java.util.ListIterator;

import com.eoe.weekday.entity.ArrayList_;

//import java.util.List;
//import com.eoe.weekday.entity.ArrayList_;

public class TestForeach {
	public static void main(String[] args) {
		ArrayList_<Integer> list=new ArrayList_<Integer>();
		list.add(100);
		list.add(90);
		list.add(80);
		list.add(95);
//		
		Iterator<Integer> iterator=list.iterator();//foreach
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("*****");
//		while(iterator.hasPrevious()){
//			System.out.print(iterator.previous()+" ");
//		}
		for(Integer i:list){
			System.out.print(i+"  ");
		}
	}
}
