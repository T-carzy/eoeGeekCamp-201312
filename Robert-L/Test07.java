package com.eoe.pre.oop.day03;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		String[] names = { "张飞", "王菲", "刘亦菲" };
		printNames("实参为字符串数组:", names);
	}

	// 打印一组人名，第一个参数描述的是参数来源，第二个参数是可变参数，可接受多个字符串包括数组
	static void printNames(String descript, String... names) {
		System.out.println(descript);
		System.out.println(Arrays.toString(names));
		for (String name : names) {
			System.out.println(name);
		}
	}
}
