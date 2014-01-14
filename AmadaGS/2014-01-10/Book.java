package com.eoe.oop.day02.entity;

public class Book {
	public int id;//编号
	public String name;//书名
	public Person author;//作者
	public String isbn;//书号
	public double price;//书价
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
		return "书名:"+this.name+
			   "\n作者:"+this.author.toString()+
			   "\n书号:"+this.isbn+
			   "\n书价:"+this.price+"元";
	}
}
