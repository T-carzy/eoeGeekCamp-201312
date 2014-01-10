package com.eoe.pre.oop.day02;

import java.awt.Point;

public class Circle {
		Point center;
		int r;
		public Circle(){
			
		}
		public Circle(int x,int y,int r){
			center=new Point();
			this.r=r;
		}
		public Circle(int r){
			this.r=r;
		}
		public double area(){
			return Math.PI*this.r*this.r;
		}
		public double l(){
			return Math.PI*2*r;
		}

	public static void main(String[] args) {
//			Circle c=new Circle(10,10,5);
			Circle c=new Circle(10);
			System.out.println(c.area());
			System.out.println(c.l());
	}

}
