package com.eoe.Oop.exercise;

public class Exercise02_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建第一个圆
		Circle c=new Circle();
		c.Point(2, 3);
		c.area(1);
		c.circum(1);
		//创建第二个圆
		Circle c1=new Circle();
		c1.Point(5, 2);
		c1.area(4);
		c1.circum(4);
	}
}
