package com.eoe.oop.test;

import com.eoe.day03.action.Action;
import com.eoe.oop.car.Car;
import com.eoe.oop.car.Motion;

public class TestCar {
public static void main(String[] args) {
	Car car =new Car("现在汽车",13000);
	System.out.println(car.getNmae()+"价格："+car.getPrice()+"元");
	car.run();
	car.stop();
	Motion motion=new Car("奔驰",100000);
	System.out.println();
	motion.run();
	motion.stop();
	System.out.println();
	Action action=new Car("宝马",100000);
	action.run();
	if (action instanceof Car) {
		((Car)action).stop();
		System.out.println("车价:"+((Car)action).getPrice()+"元");
		
	}
}
}
