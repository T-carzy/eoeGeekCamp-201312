package com.fengleiit.wow;

public class Book1 {
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book();
		b.isbn = "ISBN18005";
		b1.isbn = "ISBN18005";
		if (b.equals(b1)) {
			System.out.println("��ͬһ����");
		} else {
			System.out.println("����ͬһ����");
		}
	}
}
