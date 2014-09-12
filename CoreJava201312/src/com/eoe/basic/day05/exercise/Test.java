package com.eoe.basic.day05.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] names={"a","b","c","d"};
		System.out.println(Arrays.toString(names));
		System.out.println("index=");
		int index=new Scanner(System.in).nextInt();
		for (int i = index; i < names.length; i++) {
			names[i-1]=names[i];
		}
		names=Arrays.copyOf(names, names.length-1);
		System.out.println(Arrays.toString(names));
	}
}
