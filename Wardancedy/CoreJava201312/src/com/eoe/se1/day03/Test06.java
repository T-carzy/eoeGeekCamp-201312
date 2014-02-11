package com.eoe.se1.day03;

import com.eoe.se1.day03.entity.ArrayList2_;

public class Test06 {
	public static void main(String[] args) {
		ArrayList2_<Integer> list=new ArrayList2_<Integer>();
		list.add(100);
		list.add(200);
		list.add(250);
		list.add(350);
		Integer value;
		while((value=list.next())!=null){
			System.out.println(value);
		}
	}
}
