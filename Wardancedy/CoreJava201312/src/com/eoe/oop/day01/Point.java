package com.eoe.oop.day01;

public class Point {
	public int x;//横坐标
	public int y;//纵坐标
	//alt+/
	public Point() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Point p1=new Point(100, 20);
		Point p2=new Point();
		//值赋值的方式p1给p2赋值
		System.out.println("p1.x="+p1.x+" p1.y="+p1.y);
		p2.x=p1.x;
		p2.y=p1.y;
		System.out.println("p2.x="+p2.x+" p2.y="+p2.y);
		p2.x=1000;
		System.out.println(p1.x);
	}
}
