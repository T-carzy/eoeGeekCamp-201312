package com.eoe.pre.day03.action;

public class Player implements Action{

	@Override
	public void run() {
		System.out.println(Action.PLAYER+"正在冲刺...");
	}

}
