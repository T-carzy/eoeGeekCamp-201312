package com.ityw.se1.day03;

import com.eoe.se1.day03.entity.Node2;
import com.eoe.se1.day03.entity.Node3;

public class TestNode3 {
	public static void main(String[] args) {
		Node3<String,Character,Integer> link=new Node3<String,Character,Integer>();
		Node3<String,Character,Integer> first=link;
		link.value1="��ɺ";
		link.value2='Ů';
		link.value3=23;
		link.next=new Node3<String,Character,Integer>();
		link=link.next;
		link.value1="������";
		link.value2='��';
		link.value3=22;
		link.next=new Node3<String,Character,Integer>();
		link=link.next;
		link.value1="��С��";
		link.value2='Ů';
		link.value3=23;
		link=first;
		while(link!=null){
			System.out.println("����:"+link.value1+" �Ա�"
		+link.value2+" ���䣺"+link.value3);
			link=link.next;
		}
	}
}
