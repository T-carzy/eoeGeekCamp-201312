package com.eoe.se1.day03.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class Tset01 {
	public static void main(String[] args) {
		ArrayList<Score> scores = new ArrayList<Score>();
		scores.add(new Score(80, 81, 82, 83));
		scores.add(new Score(86, 88, 84, 86));
		scores.add(new Score(89, 88, 84, 86));
		scores.add(new Score(86, 87, 84, 86));
		Collections.shuffle(scores,new Random());
		for (Score score : scores) {
			System.out.println(score);

		}
		Collections.sort(scores, new MyComparator());
		
		System.out.println("从大到小");
		for (Score score : scores) {
			System.out.println(score);
		}

	}


	static class MyComparator implements Comparator<Score> {

		@Override
		public int compare(Score o1, Score o2) {
			return o1.java*1000+o1.android- o2.java*10+o2.android;
			
		}
		
	}
}