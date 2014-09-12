package com.eoe.pre.oop.day03;

import com.eoe.pre.oop.day03.Circle;
import com.eoe.pre.oop.day03.Point;

public class Test09 {
	/**
	 * 组合示例
	 */
	public static void main(String[] args) {
		//创建圆对象，并设置圆的半径
		Circle2 c=new Circle2(8);
		//计算并显示圆的面积和周长
		System.out.println("area="+c.area(c.r));
		System.out.println("girth="+c.girth(c.r));
		//创建圆心对象
		c.center=new Point2(5,10);
	}
}
//定义代表屏幕上一个点的类
class Point2{
	int x;
	int y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//定义代表圆的类
class Circle2 {
	Point2 center;//成员变量center代表圆心
	double r;//圆的半径
	//带一个参数的构造方法
	public Circle2(double r) {
		this.r = r;
	}
	//带三个参数的构造方法
	public Circle2(Point2 center, double r) {
		this.center = center;
		this.r = r;
	}
	//计算圆的面积 
	public double area(double r){
		return Math.PI*r*r;				
	}
	//计算圆的周长
	public double girth(double r){
		return Math.PI*2*r;
	}
}
