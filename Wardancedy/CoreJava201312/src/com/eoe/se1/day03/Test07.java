package com.eoe.se1.day03;

import java.util.ArrayList;

public class Test07 {
	public static void main(String[] args) {
		String[] names={"a","bb","cc","dd"};
		ArrayList<String> list=new ArrayList<String>();
		copy(names,list);
		Double[] scores={95.0,85.5,78.5,93.0};
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
