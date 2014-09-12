package com.eoe.pre.oop.day01;

public class Test09 {
public static void main(String[] args) {
	Point p1=new Point(6,18);
	Point p2=new Point();
	p2.x=p1.x;
	p2.y=p2.y;
	p2.x=100;
	System.out.println(p1.x);
	p2=p1;
	p2.x=100;
	System.out.println(p1.x);
	
}
}
