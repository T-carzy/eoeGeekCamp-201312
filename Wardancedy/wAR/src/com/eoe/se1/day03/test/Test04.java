package com.eoe.se1.day03.test;

import java.util.Scanner;

import com.eoe.se1.day03.NodeString;

public class Test04 {
	public static final int INI_NODE=1;
	public static final  int STRING_NODE=2;
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("1-int类型的链表");
	System.out.println("2-String类型的链表");
	int select=scanner.nextInt();
	switch (select) {
	case INI_NODE:
		intLink();
		break;
	case STRING_NODE:
		
		break;
	}
}
private static void intLink() {
	NodeString<Integer> link= new NodeString<Integer>();
	NodeString<Integer> root=link;
	link.value=100;
	link.next=new NodeString()<Integer>();
	link=link.next;
	link.value=200;
	link.next=new Node2<Integer>();
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