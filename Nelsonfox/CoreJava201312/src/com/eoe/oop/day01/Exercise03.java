package com.eoe.oop.day01;

import java.util.Arrays;

public class Exercise03 {

	public Exercise03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4 };
		int r = (int) Math.pow(a[0], 2) + (int) Math.pow(a[1], 2);
		float π = (float) 3.1415926;
		double area = π * Math.pow(r, 2);
		double girth = 2 * π * r;
		System.out.println("圆心坐标为：" + Arrays.toString(a) + "圆的半径为：" + r
				+ "圆的面积为：" + area + "圆的周长为：" + girth);

	}

}
