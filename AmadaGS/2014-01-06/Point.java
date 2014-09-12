package com.eoe.oop.Day01;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Point p1 = new Point(5, 10); 
		  Point p2 = new Point(100, 50); 
		  p2 = p1;
		  p2.x = 10; System.out.println(p1.x);
		 
		Point point = new Point();
	}
}
