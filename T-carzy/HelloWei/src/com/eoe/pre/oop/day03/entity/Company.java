package com.eoe.pre.oop.day03.entity;

public class Company implements Action{

	@Override
	public void run() {
			System.out.println(Action.COMPANY+"在运营");
	}

}
