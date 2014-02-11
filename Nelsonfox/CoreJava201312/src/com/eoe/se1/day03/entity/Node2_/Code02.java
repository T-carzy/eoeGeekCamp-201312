package com.eoe.se1.day03.entity.Node2_;

public class Code02 {

	public Code02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Node link=new Node();
	Node root=link;
	link.value="aa";
	link.next=new Node();
	link=link.next;
	link.value="bb";
	link.next=new Node();
	link=link.next;link.value="cc";
	link=root;
	while(link!=null){
		System.out.println(link.value);
		link=link.next;
	}

	}

}
