package com.eoe.day03.action;

public class Car implements Action {

	@Override
	public void run() {
     System.out.println(Action.CAR+"在行驶");
	}

}
