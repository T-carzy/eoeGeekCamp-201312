package com.eoe.oop.day03.car;

public class Car implements Motion, Product {
	private String name;// 汽車名稱
	private double price;// 汽車價位

	@Override
	public void run() {
		System.out.println(this.name + "正在運行、、、");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public void stop() {
		System.out.println(this.name + "刹車");
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}
