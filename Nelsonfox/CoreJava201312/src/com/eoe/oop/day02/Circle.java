package com.eoe.oop.day02;

import com.eoe.oop.day01.Point;

public class Circle {
	Point center;// 圆心坐标
	int r;

	public Circle() {

	}

	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		this.r = r;
	}

	public Circle(int r) {
		this.r = r;
	}

	public double area() {
		return Math.PI * this.r * this.r;
	}

	public double l() {
		return Math.PI * 2 * r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		System.out.println(circle.area());
		System.out.println(circle.l());
	}

}
