package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Random random=new Random();
		int[] scores=new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(41)+60;
		}
		System.out.println(Arrays.toString(scores));
		//����߷ֽ�����scores[0]
		for (int i = 1; i < scores.length; i++) {
			if(scores[0]<scores[i]){
				int temp=scores[0];
				scores[0]=scores[i];
				scores[i]=temp;
			}
		}
		
		System.out.println(Arrays.toString(scores));
	}
}
