package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.stream.events.Namespace;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("张飞");
		names.add("王菲");
		names.add("刘亦菲");
		names.add("咖啡");
		for (int i = 0; i < args.length; i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names);
	}

}
