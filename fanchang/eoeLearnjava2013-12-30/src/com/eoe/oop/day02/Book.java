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
		
	public Book() {
		super();
	}


	public Book(int id, String names,Person anthor
				,String isbn, double price) {
		super();
		this.id = id;
		this.names = names;
		this.author=anthor;
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
	public String details(){
		return "����:"+names+
				   "\n����:"+author+   
				   "\n���:"+isbn+
				   "\n���:"+price+"Ԫ";
	}

	public static void main(String[] args) {


	}

}
