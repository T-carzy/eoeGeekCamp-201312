package com.eoe.oop.test;

import com.eoe.day03.action.Action;
import com.eoe.day03.action.Car;
import com.eoe.day03.action.Company;
import com.eoe.day03.action.Computer;
import com.eoe.day03.action.Player;

public class TestEntity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Action[] action = new Action[4];
		action[0] = new Player();
		action[1] = new Company();
		action[2] = new Computer();
		action[3] = new Car();
		for (int i = 0; i < args.length; i++) {
			action[i].run();
		}

	}
}
