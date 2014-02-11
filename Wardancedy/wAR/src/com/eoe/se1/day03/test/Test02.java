package com.eoe.se1.day03.test;

import com.eoe.se1.day03.NodeChar;

public class Test02 {
public static void main(String[] args) {
	NodeChar link=new NodeChar();
	NodeChar frist=link; //frist 记住了头一个节点的地址
	link.value="123";
	link.next= new NodeChar();
	link=link.next;
	link.value="456";
	link.next=new NodeChar();
	link=link.next;
	link.value="789";
	link.next=frist;
	while (link!=null) {
		System.out.println(link.value);
		link=link.next;
		
	}
	
	
}
}
