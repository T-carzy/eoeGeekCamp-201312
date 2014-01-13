package com.eoe.pre.oop.day03.entity;

import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.car.Car;
import com.eoe.oop.day03.car.Motion;

public class Test05 {
	public static void main(String[] args) {
		Car car = new Car("奥迪", 600000);
		System.out.println(car.getName() + "价格:" + car.getPrice() + "元");
		car.run();
		car.stop();
		Motion motion = new Car("奔馳", 1800000);
		System.out.println();
		motion.run();
		motion.stop();
		Action action = new Car("林肯", 12000000);
		action.run();
		if (action instanceof Car) {
			((Car) action).stop();
			System.out.println(((Car) action).getPrice() + "元");
		}

	}

}
