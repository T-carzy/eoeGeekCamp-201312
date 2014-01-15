package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入被删除的整数：");
		int i = scanner.nextInt();
		list.add(12);
		list.add(23);
		list.add(34);
		list.add(45);
		list.remove((Integer) i);
		System.out.println(list);
	}
}
