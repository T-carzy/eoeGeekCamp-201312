package com.eoe.oop.day03.action;

public class Computer implements Action {

	@Override
	public void run() {
		System.out.println(Action.COMPUTER + "正在運行程序、、、");
	}

}
