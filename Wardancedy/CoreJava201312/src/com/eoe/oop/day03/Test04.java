package com.eoe.oop.day03;

import com.eoe.oop.day03.action.Action;
import com.eoe.oop.day03.car.Car;
import com.eoe.oop.day03.car.Motion;


public class Test04 {
	public static void main(String[] args) {
		Car car=new Car("�ִ�����", 130000);
		System.out.println(car.getName()+"�۸�:"+car.getPrice()+"Ԫ");
		car.run();
		car.stop();
		Motion motion=new Car("����", 300000);
		System.out.println();
		motion.run();
		motion.stop();
		//motion.getPrice();//�ڱ����ڼ�motion��Motion����
		System.out.println();
		Action action=new Car("����",400000);
		action.run();
//		action.stop();
		//action.getPrice();
		if(action instanceof Car){
			((Car)action).stop();
			System.out.println("����:"+((Car)action).getPrice()+"Ԫ");
		}
	}
}
