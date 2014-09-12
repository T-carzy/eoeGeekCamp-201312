package com.eoe.oop.day01;

public class Test09 {
	public static void main(String[] args) {
		String packageName="com.eoe.oop.day01";
		String folder=packageName.replace('.', '\\');
		System.out.println(folder);
	}
}
