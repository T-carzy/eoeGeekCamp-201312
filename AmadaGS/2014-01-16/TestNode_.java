package com.ityw.se1.day03;

import com.eoe.se1.day03.entity.Node_;

public class TestNode_ {

	public static void main(String[] args) {
		Node_<String> link =new Node_<String>();
		Node_<String> first=link;
		link.value="�ŷ�";
		link.add(new Node_<String>());
		link.next().value="����";
		link=link.next();
		link.add(new Node_<String>());
		link.next().value="�����";
		link=first;
		while(link!=null){
			System.out.println(link.value+"\t");
			link=link.next();
		}
		
	}

}
