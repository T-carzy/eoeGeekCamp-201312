package com.eoe.pre.oop.day03.entity;

import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.action.Car;
import com.eoe.oop.day03.action.Company;
import com.eoe.oop.day03.action.Computer;
import com.eoe.oop.day03.action.Player;

public class Test03 {
public static void main(String[] args) {
	Action[] actions=new Action[4];
	actions[0]=new Player();
	actions[1]=new Computer();
	actions[2]=new Car();
	actions[3]=new Company();
	for (int i = 0; i < actions.length; i++) {
		actions[i].run();
	}
}
}
