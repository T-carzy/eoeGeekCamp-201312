package com.eoe.se1.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Learn21 {

	public Learn21() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "张飞", "王菲", "刘亦菲", "吗啡" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("删除1~4的位置");
		int index = scanner.nextInt();
		for (int i = index; i < name.length; i++) {
			name[i - 1] = name[i];
		}
		name = Arrays.copyOf(name, name.length - 1);
		System.out.println(Arrays.toString(name));
	}

}
