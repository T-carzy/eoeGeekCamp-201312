package com.eoe.oop.day02.entity;

public class Book {
	public int id;//���
	public String name;//����
	public Person author;//����
	public String isbn;//���
	public double price;//���
	public Book(){
		
	}
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
		Book book=null;
		if(obj==null){
			return false;
		}
		if(obj instanceof Book){
			book=(Book) obj;
		}else{
			return false;
		}		
		return this.isbn.equals(book.isbn);
	}
	public String details(){
		return "����:"+this.name+
			   "\n����:"+this.author.toString()+
			   "\n���:"+this.isbn+
			   "\n���:"+this.price+"Ԫ";
	}
}
