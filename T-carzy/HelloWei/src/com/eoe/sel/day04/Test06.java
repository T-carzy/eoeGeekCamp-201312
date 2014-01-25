package com.eoe.sel.day04;
import java.util.Iterator;

public class Test06 {
	public static void main(String[] args) {
			ArrayList_<Integer> scores=new ArrayList_<Integer>();
			scores.add(100);
			scores.add(200);
			scores.add(300);
			scores.add(400);
			for (Integer score : scores) {
				System.out.println(score);
			}
			System.out.println("**************");
			Iterator<Integer> it=scores.iterator();
			while(it.hasNext()){
				Integer score=it.next();
				System.out.println(score);
			}
}
}
