package com.ityw.sel.day04;

import java.util.Iterator;

import com.eoe.se1.day04.entity.ArrayList_;

public class Test02 {
	public static void main(String[] args) {
		ArrayList_<Integer> scores=new ArrayList_<Integer>();
		scores.add(56);
		scores.add(89);
		scores.add(34);
		for(Integer score:scores){
		System.out.println(score);
		}
		System.out.println();
		
		Iterator<Integer> iterator=scores.iterator();
		while(iterator.hasNext()){
			Integer score1=iterator.next();
			System.out.println(score1);
     	}
	}
}
