package com.eoe.se1.day03;

import java.util.ArrayList;

public class Exercise05 {

	public Exercise05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("张飞");
		names.add("王菲");
		names.add("刘亦菲");
		names.add(0,"咖啡");
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
System.out.println();
for(String name:names){
	System.out.println(name);
}
System.out.println(names);
	}

}
