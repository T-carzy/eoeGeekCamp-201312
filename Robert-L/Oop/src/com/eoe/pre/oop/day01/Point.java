package com.eoe.pre.oop.day01;

public class Point {
	public int x;
	public int y;
	public Point() {
	}
	public Point(int x,int y){
		super();
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Point p1=new Point(100,10);
		Point p2=new Point();
		////值赋值的方式p1给p2赋值
		System.out.println("p1.x="+p1.x+"  p1.y="+p1.y);
		p2.x=p1.x;
		p2.y=p1.y;
		System.out.println("p2.x="+p2.x+"  p2.y="+p2.y);
		p2.x=1000;
		System.out.println(p2.x);
		
	}

}
