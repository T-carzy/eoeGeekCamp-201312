package com.eoe.oop.Day01;

public class TestPoint {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 10);
		p1 = swap(p1.x, p1.y);
		System.out.println(p1.x);
		System.out.println(p1.y);
	}

	static Point swap(int x, int y) {
		// Point p1 = new Point(x, y);
		int t = x;
		x = y;
		y = t;
		return new Point(x, y);
	}
}
