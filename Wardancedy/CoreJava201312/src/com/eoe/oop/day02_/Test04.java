package com.eoe.oop.day02_;

public class Test04 {

	
}
class SuperClass{
	int add(int a,int b){
		return a+b;
	}
}
class ChildClass extends SuperClass{
	@Override
	int add(int a, int b) {
		return super.add(a, b);
	}
}
