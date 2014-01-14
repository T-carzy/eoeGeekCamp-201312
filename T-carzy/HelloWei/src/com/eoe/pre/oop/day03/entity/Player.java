package com.eoe.pre.oop.day03.entity;

public class Player implements Action{

	@Override
	public void run() {
			System.out.println(Action.PLAYER+"在奔跑");
	}
	


}
