package com.eoe.oop.day03.action;

import com.eoe.se1.day01.entity.Computer;

public class Company implements Action {
	public void run() {
		System.out.println(Action.COMPANY + "在运营");
		
	}
}
