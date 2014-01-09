package com.eoe.oop.day02;

import Test04.class01;

public class Code04 {

	public Code04() {
		// TODO Auto-generated constructor stub
	}

	class SuperClass {
		int add(int a, int b) {
			return a + b;
		}
	}

	class ChildClass extends SuperClass {
		@Override
		int add(int a, int b) {
			return super.add(a, b);
		}
	}

}
