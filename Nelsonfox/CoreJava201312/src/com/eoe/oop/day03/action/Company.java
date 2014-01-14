package com.eoe.oop.day03.action;

public class Company implements Action {
	public void run() {
		System.out.println(Action.COMPANY + "在运营");
	}
}
