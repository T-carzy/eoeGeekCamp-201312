package com.eoe.pre.oop.day03.entity;

public class Car_ implements Motion,Product {
	private String name;
	private double price;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void run() {
			System.out.println(this.name+"正在行驶");
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	public Car_(){
		
	}
	public Car_(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public void stop() {
			System.out.println(this.name+"已经停止");
	}

}
