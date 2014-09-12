package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个名字：");
		String name1 = scanner.next();

		ArrayList<String> names = new ArrayList<String>();
		names.add("晓晓");
		names.add("静静");
		names.add("雯雯");
		names.add("婷婷");
		names.add(0, "菲菲");
		System.out.println(names);

		if (names.contains(name1)) {
			System.out.println("有这个人");
		} else {
			System.out.println("没有这个人");
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (String name : names) {
			System.out.println(name);
		}
		names.remove(0);
		System.out.println(names);
		names.set(0, "旺旺");
		System.out.println(names);
		if (!names.isEmpty()) {
			names.clear();
			System.out.println(names);
		}
	}
}
