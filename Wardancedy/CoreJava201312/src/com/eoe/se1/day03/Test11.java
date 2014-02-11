package com.eoe.se1.day03;

import java.util.ArrayList;

public class Test11 {
	public static void main(String[] args) {
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(93);
		ArrayList list=scores;
		ArrayList<String> names=list;
		System.out.println(names.get(0));
		
	}
}
