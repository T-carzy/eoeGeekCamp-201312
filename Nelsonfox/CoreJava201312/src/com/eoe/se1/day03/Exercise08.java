package com.eoe.se1.day03;

import java.util.ArrayList;

public class Exercise08 {

	static ArrayList<Integer> list, list2;

	public static void main(String[] args) {
		initList();

	}

	private static void initList() {
		list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(new Integer(300));

	}

	static class Integer extends Object {
		int value;

		public Integer() {

		}

		public Integer(int value) {
			this.value = value;
		}
	}
}
