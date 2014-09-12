package com.eoe.Oop;

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(10, 5);
		Point p2 = p1;//对象的地址赋值
		p2.x = 8;
		System.out.println("p1.x="+p1.x);
		Point p3 = new Point();
		p3.x = p1.x;//  对象的值赋值，数据赋值
		p3.y = p1.y;
		p3.x = 100;
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
	}
}
