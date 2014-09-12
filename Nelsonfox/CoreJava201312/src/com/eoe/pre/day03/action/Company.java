package com.eoe.pre.day03.action;

public class Company implements Action, com.eoe.oop.day03.action.Action{

	@Override
	public void run() {
		System.out.println(Action.COMPANY+"正在运营...");
	}

}
