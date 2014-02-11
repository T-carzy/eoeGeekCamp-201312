package com.eoe.oop.car;

public class Car implements Motion,Product {
	private String name;
	private double price;
	
	public String getNmae() {
		// TODO Auto-generated method stub
         return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(){
		
	}
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public double getPrice(){
		return this.price;
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"刹车");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
