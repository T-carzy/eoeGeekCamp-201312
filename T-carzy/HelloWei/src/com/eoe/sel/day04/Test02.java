package com.eoe.sel.day04;

import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
			ArrayList_<Integer> scores=new ArrayList_<Integer>();
			scores.add(90);
			scores.add(91);
			scores.add(92);
			scores.add(93);
			scores.add(94);
			scores.add(95);
			Iterator<Integer> iterator=scores.iterator();
			while(iterator.hasNext()){
				Integer score=iterator.next();
				System.out.println(score);
			}
	}

}
