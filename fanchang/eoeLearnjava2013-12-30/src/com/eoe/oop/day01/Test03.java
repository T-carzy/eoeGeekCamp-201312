package com.eoe.oop.day01;

public class Test03 {

	/**
	 * ����Point��,����������Ķ���
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1=new Point(10,8);
		Point p2=new Point();
		p2.x=p1.x;
		p2.y=p1.y;
		p1.x=20;
		System.out.println("p1("+p1.x+","+p1.y+")");
		System.out.println("p2("+p2.x+","+p2.y+")");

	}

}