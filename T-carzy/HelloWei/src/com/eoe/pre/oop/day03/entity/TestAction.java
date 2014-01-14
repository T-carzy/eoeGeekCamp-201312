package com.eoe.pre.oop.day03.entity;

public class TestAction {
	public static void main(String[] args) {
		Action [] a=new Action[4];
		a[0]=new Company();
		a[1]=new Computer();
		a[2]=new Player();
		a[3]=new Car();
		for (int i = 0; i < a.length; i++) {
			a[i].run();
		}
	}

}
