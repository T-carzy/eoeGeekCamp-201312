package com.eoe.oop.day03.car;

public class Car implements Motion, Product {
	private String name;//��������
	private double price;//����
	
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
		System.out.println(this.name+"������ʻ...");
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void stop() {
		System.out.println(this.name+"ɲ��");
	}

}
