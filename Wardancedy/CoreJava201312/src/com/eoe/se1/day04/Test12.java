package com.eoe.se1.day04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test12 {
	public static void main(String[] args) {
		Set<Integer> scores=new HashSet<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(95);
		ArrayList<Integer> scores2=new ArrayList<Integer>(scores);
		System.out.println("scores��socres2ָ�����ͬһ���϶���:"+(scores==scores2));
		
	}
}
