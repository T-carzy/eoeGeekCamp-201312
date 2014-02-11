package com.eoe.oop.day03;

import com.eoe.oop.day03.action.Car;
import com.eoe.oop.day03.action.Company;
import com.eoe.oop.day03.action.Computer;
import com.eoe.oop.day03.action.Player;

public class Test02 {
	public static void main(String[] args) {
		Company com=new Company();
		com.run();
		Computer computer=new Computer();
		computer.run();
		Player player=new Player();
		player.run();
		Car car=new Car();
		car.run();
	}
}
