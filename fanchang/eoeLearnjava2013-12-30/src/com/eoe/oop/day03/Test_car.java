package com.eoe.oop.day03;


import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.car.Car;
import com.eoe.oop.day03.car.Motion;

public class Test_car {

	/**
	 * ����car
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1=new Car("����",500000);
		System.out.println("�۸�:"+c1.getPrice());
		c1.run();
		c1.stop();
		Car c2=new Car("����",250000);
		System.out.println("�۸�:"+c2.getPrice());
		c2.run();
		c2.stop();
		Motion motion=new Car("������",8000000);
		motion.run();
		motion.stop();
		if (motion instanceof Car) {
			System.out.println("�۸�:"+((Car)motion).getPrice());
		}
		Action action=new Car("�ִ�",130000);
		action.run();
		if (action instanceof Car) {   //��Ҫ����ǿת
			((Car)action).stop();
			System.out.println("�۸�:"+((Car)action).getPrice());
		}				
	}

}
