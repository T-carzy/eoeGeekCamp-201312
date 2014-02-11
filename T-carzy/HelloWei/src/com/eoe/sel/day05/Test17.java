package com.eoe.sel.day05;

import java.util.Arrays;

public class Test17 {
	public static void main(String[] args) {
		String text="answer:A/B/C,level:10,score:2";
		String regex="[a-z:/,]+";
		String data=text.replaceAll(regex, " ").trim();
		String[] data2=data.split(" ");
		System.out.println(Arrays.toString(data2));
	}
}
