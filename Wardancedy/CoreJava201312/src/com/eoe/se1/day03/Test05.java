package com.eoe.se1.day03;

import com.eoe.se1.day03.entity.Node_;

public class Test05 {
	public static void main(String[] args) {
		//创建第一个节点对象
		Node_<String> link=new Node_<String>();
		link.value="aa";
		Node_<String> root=link;
		//在堆中创建第二个节点对象
		link.add(new Node_<String>());
		//让link指向第二个节点对象
		link=link.next();//link.next
		link.value="bb";
		//在堆中创建第三个节点->link.next
		link.add(new Node_<String>());
		//link指向第三个节点
		link=link.next();
		link.value="ccc";
		link=root;
		while(link!=null){
			System.out.println(link.value);
			link=link.next();
		}
	}
}
