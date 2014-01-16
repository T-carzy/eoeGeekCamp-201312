package com.eoe.se1.day03.entity.Node2_;

public class Code06 {
//创建链表Link对象
	public static void main(String[] args) {
		//创建链表link对象
		Node<String> link=new Node<String>();
		//first存放链表中的首个节点的地址
		Node<String> first=link;
		//节点对象的数据赋值
		link.value="张飞";
		//创建第二个节点对象，地址存放在link.next中
		link.next=new Node<String>();
		//第二个节点的数据赋值
		link.next.value="王菲";
		//link指向第二个节点对象
		link=link.next;
		//link只想第三个节点对象，有第二个节点对象的next指向
		link.next=new Node<String>();
		//第三个节点对象的数据赋值
		link.next.value="刘亦菲";
		link=first;//link指向第一个节点对象
		while(link!=null){
			System.out.println(link.value);
            link=link.next;
		}
	}
}
