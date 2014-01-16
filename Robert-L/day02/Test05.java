package com.eoe.se1.day02;

import java.util.ArrayList;

public class Test05 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("李伟");
		names.add("高珊");
		names.add("侯亮");
		names.add("樊昶");
		names.add(0, "冯蕾");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names);
	}
}
