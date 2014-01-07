package com.eoe.oop.day01;

public class Work06 {

	public Work06() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(10, 8);
		Point p2 = new Point();
		p2 = p1;
		p2.x = 100;// 地址赋值，所以p1的值会变
		System.out.println(p1.x);
	}

}
