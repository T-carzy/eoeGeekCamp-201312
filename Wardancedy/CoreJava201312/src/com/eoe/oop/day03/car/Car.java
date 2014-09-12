package com.eoe.oop.day03.car;

public class Car implements Motion, Product {
	private String name;//汽车名称
	private double price;//车价
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param price
	 */
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void run() {
		System.out.println(this.name+"正在行驶...");
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void stop() {
		System.out.println(this.name+"刹车");
	}

}
