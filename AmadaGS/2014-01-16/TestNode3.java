package com.ityw.se1.day03;

import com.eoe.se1.day03.entity.Node2;
import com.eoe.se1.day03.entity.Node3;

public class TestNode3 {
	public static void main(String[] args) {
		Node3<String,Character,Integer> link=new Node3<String,Character,Integer>();
		Node3<String,Character,Integer> first=link;
		link.value1="高珊";
		link.value2='女';
		link.value3=23;
		link.next=new Node3<String,Character,Integer>();
		link=link.next;
		link.value1="刘旭阳";
		link.value2='男';
		link.value3=22;
		link.next=new Node3<String,Character,Integer>();
		link=link.next;
		link.value1="王小哲";
		link.value2='女';
		link.value3=23;
		link=first;
		while(link!=null){
			System.out.println("姓名:"+link.value1+" 性别："
		+link.value2+" 年龄："+link.value3);
			link=link.next;
		}
	}
}
