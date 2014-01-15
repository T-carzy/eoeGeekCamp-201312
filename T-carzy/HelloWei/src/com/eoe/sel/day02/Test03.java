package com.eoe.sel.day02;

import java.util.ArrayList;

public class Test03 {


	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("张飞");
		names.add("王菲");
		names.add("吗啡");
		names.add("咖啡");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("*******************");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("*******************");
		System.out.println(names);
	}

}
