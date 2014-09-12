package com.eoe.se1.day03.entity.Node2_;

import java.util.Scanner;

public class Code03 {
public static final int INT_NODE=1;
public static final int STRING_NODE=2;
	public Code03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("1-int类型的链表");
	System.out.println("2-string类型的链表");
	int select=scanner.nextInt();
	switch (select) {
	case INT_NODE:
		initLink();
		break;
	case STRING_NODE:
		stringnode();
	default:
		break;
	}

	}

	private static void stringnode() {
		Node<String> link=new Node<String>();
		Node<String> root=link;
		link.value="abc";
		link.next=new Node<String>();
		link=link.next;
		link.value="bcd";
		link.next=new Node<String>();
		link=link.next;
		link.value="yui";
		link=root;
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
		
	}

	private static void initLink() {
Node<Integer> link=new Node<Integer>();
Node<Integer> root=link;
link.value=100;
link.next=new Node<Integer>();
link=link.next;
link.value=200;
link.next=new Node<Integer>();
link=link.next;link.value=300;
link=root;
while(link!=null){
	System.out.println(link.value);
	link=link.next;
}
		
	}

}
