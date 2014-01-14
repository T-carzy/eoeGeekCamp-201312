package com.eoe.pre.oop.day03.entity;

public class TestCar_ {
	public static void main(String[] args) {
		Car_ car=new Car_("火车",999999 );
				System.out.println(car.getName()+"价格："+car.getPrice()+"$");
				car.run();
				car.stop();
				Motion m=new Car_("飞机", 2222222);
				m.run();
				m.stop();
				System.out.println();
				Action act=new Car_("火箭", 555555555);
				act.run();
//				act.stop();
				if(act instanceof Car_){
					Car_ c=(Car_)act;
					c.stop();
					System.out.println(c.getName()+"价格："+c.getPrice()+"$");
				}
	}

}
