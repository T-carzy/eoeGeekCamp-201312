package com.eoe.oop.day02;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c=new Circle(10, 12, 8);
	}
}
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
class Circle extends Point{
	double r;
	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	public double area(double r){
		return Math.PI*r*r;				
	}
	public double girth(double r){
		return Math.PI*2*r;
	}
}
