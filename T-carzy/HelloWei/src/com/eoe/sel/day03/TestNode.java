package com.eoe.sel.day03;

import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;

public class TestNode {
	public static final int INT_NODE=1;
	public static final int STRING_NODE=2;
	

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("1-int类型的链表");
			System.out.println("2-string类型的链表");
			int select=scanner.nextInt();
			switch(select){
			case INT_NODE:
				intLink();
				break;
			case STRING_NODE:
				stringLink();
				break;
			}
	}


	private static void stringLink() {
			Node<String> link=new Node<String>();
			Node<String> root=link;
			link.value="aaa";
			link.next=new Node<String>();
			link.next=link;
			link.value="bbb";
			link.next=new Node<String>();
			link=link.next;
			link.value="ccc";
			link=root;
			while(link!=null){
				System.out.println(link.value);
				link=link.next;
			}
	}


	private static void intLink() {
		Node<Integer> link=new Node<Integer>();
		Node<Integer> root=link;
		link.value=100;
		link.next=new Node<Integer>();
		link=link.next;
		link.value=200;
		link.next=new Node<Integer>();
		link=link.next;
		link.value=300;
		link=root;
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
	}

}
