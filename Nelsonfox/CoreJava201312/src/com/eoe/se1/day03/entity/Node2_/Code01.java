package com.eoe.se1.day03.entity.Node2_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Code01 {

	public Code01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Score> scores=new ArrayList<Score>();
scores.add(new Score(92, 95, 85, 75));
scores.add(new Score(94, 85, 75, 81));
scores.add(new Score(91, 84, 71, 74));
scores.add(new Score(97, 82, 72, 84));
scores.add(new Score(94, 79, 75, 81));
Collections.shuffle(scores,new Random());
for(Score score:scores){
	System.out.println(score);
}
Collections.sort(scores,new MyComparor());
System.out.println("******************");
for(Score score:scores){
	System.out.println(score);
}
	}
static class MyComparor implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {

return o1.java*1000+o1.android*100+o1.oricl*10+o1.sql-(o2.java*1000+o2.android*100+o2.oricl*10+o2.sql);
	}
	
}
}
