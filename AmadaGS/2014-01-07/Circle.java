package com.eoe.Oop.exercise;

public class Circle {
	int x;
	int y;
	double r;
	double PI=3.14;
	/*public Circle() {
		// TODO Auto-generated constructor stub
	}*/
	public void Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Ô²ÐÄ×ø±êÎª:("+x+","+y+")");
	}
	public   void circum(double r){
		double circum=2*PI*r;
		System.out.println("circum="+circum);
	}
	public void area(double r){
		double area=PI*r*r;
		System.out.println("area="+area);
	}
}
