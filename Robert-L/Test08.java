package com.eoe.pre.oop.day03;

import com.eoe.pre.oop.day03.Circle;
import com.eoe.pre.oop.day03.Point;

public class Test08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle1 c = new Circle1(10, 12, 8);
	}
}

class Point1 {
	int x;
	int y;

	public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

class Circle1 extends Point1 {
	double r;

	public Circle1(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	public double area(double r) {
		return Math.PI * r * r;
	}

	public double girth(double r) {
		return Math.PI * 2 * r;
	}
}
