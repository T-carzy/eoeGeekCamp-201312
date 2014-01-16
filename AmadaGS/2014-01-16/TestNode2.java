package com.ityw.se1.day03;

import com.eoe.se1.day03.entity.Node2;

public class TestNode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node2<String,Integer> link=new Node2<String,Integer>();
		Node2<String,Integer> first=link;
		link.value1="高珊";
		link.value2=23;
		link.next=new Node2<String,Integer>();
		link=link.next;
		link.value1="王多英";
		link.value2=18;
		link.next=new Node2<String,Integer>();
		link=link.next;
		link.value1="冯雷";
		link.value2=4;
		link=first;
		while(link!=null){
			System.out.println("姓名："+link.value1+"  年龄："+link.value2);
			link=link.next;
		}
	}
}
