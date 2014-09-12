package com.eoe.oop.day02.exercise;

import com.eoe.oop.day01.Person;

public class Book {
	public int id;//编号
	public String name;//书名
	public Person author;
	public String isbn;
	public double price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param author
	 * @param isbn
	 * @param price
	 */
	public Book(int id, String name, Person author, String isbn, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		if(null==obj){
			return false;
		}
		if(obj==this){
			return true;
		}
		Book other=null;
		if(obj instanceof Book){
			other=(Book) obj;
		}else{
			return false;
		}
		return this.isbn.equals(other.isbn);
	}
	public void detaisl(){
		System.out.println("编号:"+this.id+",书名:"
			+this.name+",书号:"+this.isbn+",书价:"+
			this.price+",作者:"+author.name);
	}
}
