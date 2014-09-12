package com.eoe.oop.day01;

public class Test06 {
	public static void main(String[] args) {
		Point p1=new Point(10,8);
		Point p2=new Point();
		p2=p1;
		p2.x=100;
		System.out.println(p1.x);
	}
}
