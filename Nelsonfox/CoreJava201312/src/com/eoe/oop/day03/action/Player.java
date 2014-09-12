package com.eoe.oop.day03.action;

public class Player implements Action {
	public void run() {
		System.out.println(Action.PLAYER + "在冲刺...");
	}
}
