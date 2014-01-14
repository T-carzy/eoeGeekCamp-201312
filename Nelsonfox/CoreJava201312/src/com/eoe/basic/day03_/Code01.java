package com.eoe.basic.day03_;

import com.eoe.day03.car.Car;
import com.eoe.day03.car.Motion;
import com.eoe.oop.day03.action.Action;

public class Code01 {
	public static void main(String[] args) {
		Car car = new Car("现代", 130000);
		System.out.println(car.getNameString() + "价格" + car.getPrice() + "元");
		car.run();
		car.stop();
		Motion motion = new Car("奔驰", 300000);
		System.out.println();
		motion.run();
		motion.stop();
		if (motion instanceof Car) {
			System.out.println("车价" + ((Car) motion).getPrice());
		}
		System.out.println();
		Action action = new Car("宝马", 400000);
		action.run();
		if (action instanceof Car) {
			((Car) action).stop();
			System.out.println("车价" + ((Car) action).getPrice());
		}
	}

}
