package com.eoe.se1.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Score> scores=new ArrayList<Score>();
		scores.add(new Score(90, 95, 88, 78));
		scores.add(new Score(92, 93, 88	, 85));
		scores.add(new Score(92, 90, 98	, 87));
		scores.add(new Score(88, 91, 87	, 85));
		scores.add(new Score(92, 95, 89	, 86));
		Collections.shuffle(scores,new Random());
		for(Score score:scores){
			System.out.println(score);
		}
//		Collections.sort(scores, new Comparator<Score>() {
//
//			@Override
//			public int compare(Score o1, Score o2) {
//				// TODO Auto-generated method stub
//				return o1.java-o2.java;
//			}
//		});
		Collections.sort(scores,new MyComparator());
		System.out.println("*******************");
		for(Score score:scores){
			System.out.println(score);
		}
	}
	static class MyComparator implements Comparator<Score>{
		/*java作为第一关键字，android：第二个键子、
		sql第三关键字,oracle第四关键字
		*/
		@Override
		public int compare(Score o1, Score o2) {
			return o1.java*10+o1.android-
				  (o2.java*10+o2.android);
		}
	}
}
