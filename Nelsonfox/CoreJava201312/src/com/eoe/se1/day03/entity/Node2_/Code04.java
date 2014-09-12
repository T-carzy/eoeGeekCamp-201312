package com.eoe.se1.day03.entity.Node2_;

public class Code04 {

	public Code04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node2<String, Integer> link = new Node2<String, Integer>();
		Node2<String, Integer> root = link;
		link.value = "多多";
		link.value2 = 240;
		link.next = new Node2<String, Integer>();
		link = link.next;
		link.value = "hw";
		link.value2 = 100;
		link.next = new Node2<String, Integer>();
		link = link.next;
		link.value = "梁文峰";
		link.value2 = 200;
		link = root;
		while (link != null) {
			System.out.println(link.value);
			System.out.println(link.value2);
			link = link.next;
		}
	}

}
