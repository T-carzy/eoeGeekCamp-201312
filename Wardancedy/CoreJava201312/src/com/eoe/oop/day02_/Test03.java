package com.eoe.oop.day02_;

import com.eoe.oop.day01.Person;

public class Test03 {
	public static void main(String[] args) {
		Person p1=new Person("�ŷ�", '��',33, 1.99, "���ŵ�");
		//Enginner p2=new Enginner("�ŷ�");
		Person p2=new Person("�ŷ�", '��',33, 1.89, "���ŵ�");
		if(p1.equals(p2)){
			System.out.println("��һ����");
		}else{
			System.out.println("����һ����");
		}
	}
}
