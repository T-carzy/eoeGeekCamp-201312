package com.eoe.se1.day03.entity;

public class Node_<T> implements Collection_<Node_<T>> {
	public T value;//存储数据
	private Node_<T> next;
	//将value的地址保存在next中
	@Override
	public void add(Node_<T> value) {
		this.next=value;
		//link.next=new Node_<String>();
	}

	@Override
	public Node_<T> next() {
		//link=link.next
		return this.next;
	}

}
