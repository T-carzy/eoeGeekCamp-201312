package com.eoe.oop.day03;

import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.car.Car;
import com.eoe.oop.day03.car.Motion;


public class Test04 {
	public static void main(String[] args) {
		Car car=new Car("现代汽车", 130000);
		System.out.println(car.getName()+"价格:"+car.getPrice()+"元");
		car.run();
		car.stop();
		Motion motion=new Car("奔驰", 300000);
		System.out.println();
		motion.run();
		motion.stop();
		//motion.getPrice();//在编译期间motion是Motion类型
		System.out.println();
		Action action=new Car("宝马",400000);
		action.run();
//		action.stop();
		//action.getPrice();
		if(action instanceof Car){
			((Car)action).stop();
			System.out.println("车价:"+((Car)action).getPrice()+"元");
		}
	}
}
