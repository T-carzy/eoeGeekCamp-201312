package com.eoe.pre.oop.day01;

public class Point {
//	public int x;//横坐标
//	public int y;//纵坐标
	
			public int x;
			public int y;
			public Point(int x,int y){
				super();
				this.x=x;
				this.y=y;
			}
			public Point() {
				// TODO Auto-generated constructor stub
			}
			public static void main(String[]args){
				Point p=new Point(100,200);
				Point pp=new Point();
				System.out.println("p.x="+p.x+" p.y="+p.y);
				pp.x=p.x;
				pp.y=p.y;
				System.out.println("pp.x="+pp.x+" pp.y="+pp.y);
				pp.x=p.x;
				pp.y=p.y;
				System.out.println("pp.x="+pp.x+" pp.y="+pp.y);
				pp.x=99999;
				System.out.println(p.x);
			}

}
