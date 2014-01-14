package com.eoe.pre.oop.day03.entity;

public class Computer implements Action{



	@Override
	public void run() {
			System.out.println(Action.COMPUTER+"在运行");
	}

}
