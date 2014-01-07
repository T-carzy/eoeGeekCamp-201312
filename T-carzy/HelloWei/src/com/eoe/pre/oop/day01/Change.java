package com.eoe.pre.oop.day01;

public class Change {


	public static void main(String[] args) {
			Point p=new Point(100,200);
			Point pp=new Point();
			pp=p;
			pp.x=99999;
			System.out.println(p.x);
	}

}
