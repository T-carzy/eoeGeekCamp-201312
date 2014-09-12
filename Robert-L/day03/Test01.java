package com.eoe.se1.day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Score> scores = new ArrayList<Score>();
		scores.add(new Score(89, 90, 80, 100));
		scores.add(new Score(69, 99, 80, 50));
		scores.add(new Score(89, 97, 80, 60));
		scores.add(new Score(100, 91, 83, 90));
		Collections.shuffle(scores, new Random());
		for (Score score : scores) {
			System.out.println(score);
		}
		Collections.sort(scores, new MyComparator());
		System.out.println("****************");
		for (Score score : scores) {
			System.out.println(score);
		}
	}

	static class MyComparator implements Comparator<Score> {

		@Override
		public int compare(Score o1, Score o2) {
			// return o1.java-o2.java;
			// return o1.java*10+o1.andriod - (o2.java*10+o2.andriod);
			// return
			// o1.java*100+o1.andriod*10+o1.sql-(o2.java*100+o2.andriod*10+o2.sql);
			return o1.java
					* 1000
					+ o1.andriod
					* 100
					+ o1.sql
					* 10
					+ o1.oracle
					- (o2.java * 1000 + o2.andriod * 100 + o2.sql * 10 + o2.oracle);
		}
	}
}
