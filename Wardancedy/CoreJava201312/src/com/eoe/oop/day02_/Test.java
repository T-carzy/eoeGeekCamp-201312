package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;
import com.eoe.oop.day02.exercise.Book;

public class Test {
	public static void main(String[] args) {
//		String s="abc";
//		String str="abc";
//		String str2=new String("abc");
		String strPerson="李刚:男:33:1.67:快乐的";
		String[] data=strPerson.split(":");
		Person author=new Person(data[0], 
			data[1].charAt(0), 
			Integer.parseInt(data[2]), 
			Double.parseDouble(data[3]), data[4]);
		String strBook="1:《疯狂Java》:ISBN18005:85";
		data=strBook.split(":");
		Book book=new Book(Integer.parseInt(data[0]), 
			data[1], author, data[2], 
			Double.parseDouble(data[3]));
		book.detaisl();
		author=new Person("尧老师", '男', 45, 1.75, "稳重的");
		Book book2=new Book(2, "Android开发教程", author, "ISBN18005", 88);
		if(book.equals(book2)){
			System.out.println("是一本书");
		}else{
			System.out.println("不是一本书");
		}
	}
}
