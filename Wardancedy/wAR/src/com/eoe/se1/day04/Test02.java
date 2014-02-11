package com.eoe.se1.day04;

import java.util.ArrayList;
import java.util.Iterator;

import com.eoe.se1.day04.entity.ArrayList_;

public class Test02 {
	public static void main(String[] args) {
		ArrayList_<Integer> scores = new ArrayList_<Integer>();
		scores.add(90);
		scores.add(100);
		scores.add(95);
		scores.add(92);
		scores.add(83);
		Iterator<Integer> iterator = scores.iterator();
		while (iterator.hasNext()) {
			Integer score = iterator.next();
			System.out.println(score);
		}
	}
}
