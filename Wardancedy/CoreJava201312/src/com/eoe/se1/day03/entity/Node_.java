package com.eoe.se1.day03.entity;

public class Node_<T> implements Collection_<Node_<T>> {
	public T value;//�洢����
	private Node_<T> next;
	//��value�ĵ�ַ������next��
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
