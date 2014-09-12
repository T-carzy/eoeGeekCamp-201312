package com.ityw.se1.day03;

import java.util.Random;

import com.eoe.se1.day03.entity.ArrayList_;

public class TestArray_01 {
	public static void main(String[] args) {
		ArrayList_<Integer> scores=new ArrayList_<Integer>();
		Random random=new Random();
		for(int i=0;i<10;i++){
			scores.add(random.nextInt());
			System.out.println(scores.get(i)+"\t");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<scores.size();i++){
			sum+=scores.get(i);
		}
		System.out.println("×Ü·Ö£º"+sum);
	}

}
