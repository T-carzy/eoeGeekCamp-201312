package com.eoe.se1.day03.entity.Node2_;

import java.util.ArrayList;

public class Code07 {
	public static void main(String[] args) {
		String[] names={"a","bb","ccc","dd"};
		ArrayList<String> list=new ArrayList<String>();
		copy(names,list);
		Double[] scores={95.0,65.0,85.5,95.5,12.5};
		ArrayList<Double> list2=new ArrayList<Double>();
		copy(scores,list2);
	}
static <T> void copy(T[] src,ArrayList<T> dest){
	for(T t:src){
		dest.add(t);
	}
	System.out.println(dest);
}
}
