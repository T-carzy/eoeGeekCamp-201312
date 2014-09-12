package com.eoe.oop.day02_;

public class Circle {
	Point center;//Ô²ÐÄ×ø±ê
	int r;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param x
	 * @param y
	 * @param r
	 */
	public Circle(int x, int y, int r) {
		center=new Point(x, y);
		this.r = r;
	}
	public Circle(int r){
		this.r=r;
	}
	public double area(){
		return Math.PI*this.r*this.r;
	}
	public double l(){
		return Math.PI*2*r;
	}
	public static void main(String[] args) {
		//Circle c=new Circle(10, 10, 5);
		Circle c=new Circle(10);
		//c.r=10;
		System.out.println(c.area());
		System.out.println(c.l());
	}
}
