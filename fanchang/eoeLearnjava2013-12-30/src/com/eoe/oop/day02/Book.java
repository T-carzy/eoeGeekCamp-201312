package com.eoe.oop.day02;

public class Book {

	/**
	 * 4����֪��������
	String strPerson="���:��:33:1.67:���ֵ�";
	String strBook="1:�����Java��:ISBN18005:85";
	(1)��com.eoe.oop.day02���´���Book���󣬸ö�������������ԣ�
		id��������ı�ţ�
		name������������
		author:�������ߣ������Ե�������Person��
		isbn:������ţ�
		price:������ۡ�
	(2)��дtoString()������������
	(3)��дequals(),��������ȵ������������ȡ�
	(4)��дpublic String details()���÷�����ʾ�����������ֵ��
	 * @param args
	 */
//������4������
	public int id;
	public String names;
	public String isbn;
	public double price;

	
//�����вη���	
	public Book(int id, String names, String isbn, double price) {
		super();
		this.id = id;
		this.names = names;
		this.isbn = isbn;
		this.price = price;
	}
	
//��дtoString
	@Override
	public String toString() {
		
		return this.names;
	}
	
//��дequals
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {               //objΪ��,�򷵻�false
			return false;
		}
		Person other=null;
		if (obj instanceof Person) {   //�ж��ܷ�ת��
			other=(Person) obj;        //ǿ��ת������ֵ��other
		}else {
			return false;
		}if (obj==this) {          		//obj�ĵ�ַ���������ĵ�ַ���,
			return true;
		}
		return this.isbn==obj;
	}
	public String details(){
		System.out.println("���:"+id+",����"+names+
				"���:"+isbn+"�۸�:"+price);
		Person.say();
	}

	public static void main(String[] args) {
		Author author = new Author("���", '��', 33, 1.67, "���ֵ�");
		Book book1=new Book(1, "�����Java��", "ISBN18005", 85);
		Book book2=new Book(1, "�����Java��", "ISBN18005", 85);
		System.out.println(book1.equals(book2));
		String strPerson="���:��:33:1.67:���ֵ�";
		String strBook="1:�����Java��:ISBN18005:85";
		
	}

}
