package com.eoe.weekday.Test;

import java.util.Random;

import com.eoe.weekday.entity.ArrayList_;


public class TestArray_01 {
	public static void main(String[] args) {
		ArrayList_<Integer> scores=new ArrayList_<Integer>();
		Random random=new Random();
		for(int i=0;i<10;i++){
			scores.add(random.nextInt(100));//添加
			System.out.print(scores.get(i)+"    ");//获取
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<scores.size();i++){
			sum+=scores.get(i);
		}
		System.out.println("总分："+sum);
	}

}
