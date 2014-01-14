package com.eoe.day03.car;

public class Car implements Motion, Product {
	private String nameString;// 汽车名称
	private double price;// 车价

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car() {

	}

	@Override
	public void run() {
		System.out.println(this.nameString + "正在行驶....");

	}

	public Car(String nameString, double price) {
		super();
		this.nameString = nameString;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void stop() {
		System.out.println(this.nameString + "刹车");
	}

}
