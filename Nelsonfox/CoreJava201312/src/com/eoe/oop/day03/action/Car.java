package com.eoe.oop.day03.action;

public class Car implements Action {
	public void run() {
		System.out.println(Action.CAR + "在行驶...");
	}
}
