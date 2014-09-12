package com.eoe.oop.day02;

public class Code12 {

	public Code12() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 父类
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SuperClass {
	int add(int a, int b) {
		return a + b;
	}
}

// 子类
class ChildClass extends SuperClass {
	// 计算并返回两个double类型的数据之和
	@Override
	int add(int a, int b) {
    return super.add(a, b);
	}
}
