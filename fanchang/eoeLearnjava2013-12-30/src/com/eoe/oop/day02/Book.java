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
	public int id;        	//���
	public String names;    //����
	public String isbn;     //���
	public double price;    //�۸�
	public Person author;   //����

	
//�����вη���	
		
		public Book(int id, String names, String isbn, double price, Person author) {
		super();
		this.id = id;
		this.names = names;
		this.isbn = isbn;
		this.price = price;
		this.author = author;
	}

	
//��дtoString
	@Override
	public String toString() {
		
		return this.names;
	}

//��дequals
	@Override
	public boolean equals(Object obj) {    //objĿ���ַ
		if (obj==null) {               //objΪ��,�򷵻�false
			return false;
		}
		Book other=null;
		if (obj instanceof Person) {   //�ж��ܷ�ת��
			other=(Book) obj;        //ǿ��ת������ֵ��other
		}else {
			return false;
		}if (obj==this) {          		//obj�ĵ�ַ���������ĵ�ַ���,
			return true;
		}
		return this.isbn.equals(other.isbn);
	}
	public void details(){
		System.out.println("���:"+id+",����"+names+
				"���:"+isbn+"�۸�:"+price+"����:"+author);
	}

	public static void main(String[] args) {
		String strPerson="���:��:33:1.67:���ֵ�";
		String strBook="1:�����Java��:ISBN18005:85";
		String[] data=strPerson.split(":");             //ͬ":"�ָ�����������
		Person author=new Person(data[0],data[1],data[2],data[3],data[4]);
		Book book1=new Book(1, "�����Java��",anthor, "ISBN18005", 85);
		
//		Book book2=new Book(1, "�����Java��", "ISBN18005", 85);
//		System.out.println(book1.equals(book2));
//		String strPerson="���:��:33:1.67:���ֵ�";
//		String strBook="1:�����Java��:ISBN18005:85";

	}

}
