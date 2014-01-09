package com.eoe.pre.oop.day02;

public class Super {
	class SuperClass{
		int add(int a,int b){
			return a+b;
		}
	}
	class Childclass extends SuperClass{
		int add(int a,int b){
			return super.add(a,b);
		}
	}


}
