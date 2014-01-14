package com.eoe.oop.day03.action;

public class Company implements Action {

	@Override
	public void run() {
		System.out.println(Action.COMPANY + "正在運營、、、");
	}

}
