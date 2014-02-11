package com.eoe.se1.day03;

import javax.xml.soap.Node;

public class Nodechar {
private char value;
private Nodechar next;

public static void main(String[] args) {
	Nodechar link=new Nodechar();
	Nodechar root=link;//root记住链表的头一个节点地址
	link.value='a';
	//在堆中创建第二个节点对象，地址保存在link.next
    link.next=new Nodechar();
    link=link.next;	
    link.value='b';
  //在堆中创建第三个节点对象，地址保存在link.next
    link.next=new Nodechar();
    link=link.next;
    link.value='c';
  //在堆中创建第四个节点对象，地址保存在link.next
    link.next=new Nodechar();
    link=link.next;
    link.value='d';
    link=root;
    while(link!=null){
    	System.out.println(link.value);
    	link=link.next;
    }
}
}
