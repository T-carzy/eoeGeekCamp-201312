package com.eoe.se1.day04;

import java.util.ArrayList;

public class Test10 {
	public static void main(String[] args) {
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(95);
		
		ArrayList<Integer> scores2=(ArrayList<Integer>) scores.clone();
		System.out.println("scores��socres2ָ�����ͬһ���϶���:"+(scores==scores2));
		System.out.println("scores.get(0)��scores2.get(0)ָ��ͬһ����:"+(scores.get(0)==scores2.get(0)));
		
	}
}
