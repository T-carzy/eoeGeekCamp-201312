package com.eoe.oop.day02;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
/** 父类
 */
class SuperClass{
	//计算并返回两个int类型数据之和
	int add(int a,int b){
		return a+b;
	}
}
/** 子类
 */
class ChildClass extends SuperClass{
	//计算并返回两个double类型的数据之和
//	@Override
//	double add(int a, int b) {
//		return super.add(a, b);
//	}
}

