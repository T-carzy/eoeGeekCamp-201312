package com.eoe.sel.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
			ArrayList<Score> scores=new ArrayList<Score>();
			scores.add(new Score(99,99,99,99));
			scores.add(new Score(99,98,97,96));
			scores.add(new Score(98,97,96,95));
			scores.add(new Score(98,99,98,99));
			scores.add(new Score(99,99,98,98));
			Collections.shuffle(scores,new Random());
			for (Score score : scores) {
				System.out.println(score);
			}
			Collections.sort(scores,new Comparator<Score>() {

				@Override
				public int compare(Score o1, Score o2) {
//					if(o1.java-o2.java==0){
//						return o1.android-o2.android;
//					}if(o1.android-o2.android==0){
//						return o1.sql-o2.sql;
//					}if(o1.sql-o2.sql==0){
//						return o1.oracle-o2.oracle;
//					}
					return o1.java-o2.java;
				
				
				}
			});
			System.out.println("*********************");
			for (Score score : scores) {
				System.out.println(score);
			}
	}
	

}
