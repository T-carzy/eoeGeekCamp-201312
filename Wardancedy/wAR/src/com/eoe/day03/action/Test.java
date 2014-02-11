package com.eoe.day03.action;

import com.eoe.day03.action.Action;
public class Test {
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
