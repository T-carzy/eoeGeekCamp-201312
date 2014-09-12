package com.eoe.se1.day03.test;

import com.eoe.se1.day03.NodeInt;

public class Test03 {
public static void main(String[] args) {
	NodeInt link=new NodeInt();
	NodeInt frist=link;
	link.value="高珊";
	link.next=new NodeInt();
	link=link.next;
	link.value="韩伟";
	link.next=new NodeInt();
	link=link.next;
	link.value="李伟";
	link=link.next;
	while(link!=null){
		System.out.println(link.value);
		link=link.next;
	}
}
}
