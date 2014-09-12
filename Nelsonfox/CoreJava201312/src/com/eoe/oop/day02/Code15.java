package com.eoe.oop.day02;

import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.action.Car;
import com.eoe.oop.day03.action.Computer;
import com.eoe.oop.day03.action.Player;
import com.eoe.pre.day03.action.Company;

public class Code15 {
	public static void main(String[] args) {
		Action[] action = new Action[4];
		action[0] = new Player();
		action[1] = new Computer();
		action[2] = new Company();
		action[3] = new Car();
		for (int i = 0; i < action.length; i++) {
			action[i].run();
		}
	}
}
