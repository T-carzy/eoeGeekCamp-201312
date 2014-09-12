package com.eoe.oop.day02;

import java.util.Arrays;

public class Test10_ {
	public static void main(String[] args) {
		String[] names={"张飞","王菲","刘亦菲"};
		printNames("实参为字符串数组", names);
		printNames("实参为若干个字符串","张飞","王菲","刘亦菲","李菲 ");
	}
	//打印一组人名，第一个参数描述参数的来源，第二个参数是可变参数，可接收多个字符串包括数组
	static void printNames(String descript,String... names){
		System.out.println(descript);
		System.out.println(Arrays.toString(names));
		for(String name:names){
			System.out.println(name);
		}
		System.out.println();
	}
}
