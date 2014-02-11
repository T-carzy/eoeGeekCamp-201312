package com.eoe.oop.day02.entity;

public class Number {
	int i=10;
	{
		i=5;
	}
	public Number(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		new Number();
	}
}
