package com.ityw.se1.day03;

import java.util.Scanner;

import com.eoe.se1.day03.entity.Node;

public class TestNode1 {
	public static final int INT_NODE=1;
	public static final int STRING_NODE=2;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-int���͵�����");
		System.out.println("2-String���͵�����");
		int select=scanner.nextInt();
		switch (select) {
		case INT_NODE:
			intLink();
			break;
		case STRING_NODE:
			stringLink();
			break;
		}
	}
	private static void stringLink() {
		System.out.println("�Ŷ��Ŷ���~");
		Node<String> link=new Node<String>();
		Node<String> first=link;
		link.value="��ɺ";
		link.next=new Node<String>();
		link=link.next;
		link.value="��ΰ";
		link.next=new Node<String>();
		link=link.next;
		link.value="����Ӣ";
		link=first;
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
	}
	private static void intLink() {
		Node<Integer> link= new Node<Integer>();
		Node<Integer> root=link;
		link.value=100;
		link.next=new Node<Integer>();
		link=link.next;
		link.value=200;
		link.next=new Node<Integer>();
		link=link.next;
		link.value=300;
		//link.next=root;
		link=root;
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
	}
}
