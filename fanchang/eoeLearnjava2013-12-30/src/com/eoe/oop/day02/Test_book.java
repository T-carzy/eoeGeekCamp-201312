package com.eoe.oop.day02;

public class Test_book {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strPerson="���:��:33:1.67:���ֵ�";
		String strBook="1:�����Java��:ISBN18005:85";
		String[] data=strPerson.split(":");             //ͬ":"�ָ�����������
		Person author=new Person(data[0],data[1].charAt(0)
				,Integer.parseInt(data[2])
				,Double.parseDouble(data[3]),data[4]);//����author����
		data=strBook.split(":"); 
		Book b1=new Book(Integer.parseInt(data[0]), data[1], author,data[2],
				Double.parseDouble(data[3]));			//����b1����
		//��������b2
		Book b2=new Book(2, "�����android��",author, "ISBN18003", 58.5);
		String c=b1.toString();           //����b1������
		System.out.println(c);			  
		boolean d=b1.isbn.equals(b2.isbn);  //�Ƚ�b1��b2�Ƿ���һ����
		System.out.println("book1��book2��һ����   !"+d);
		c=b1.details();
		System.out.println("book1������:\n"+c);
		c=b2.details();
		System.out.println("book2������:\n"+c);
		System.out.println("���ߺʹ�Ҵ��к���~");
		author.say();
		
	}

}
