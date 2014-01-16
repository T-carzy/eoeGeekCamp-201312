package com.eoe.se1.day03.entity;

public class Node_<T> implements Collection_<Node_<T>> {
	public T value;
	private Node_<T> next;

	@Override
	public void add(Node_<T> t) {
		next=t;
		
	}

	@Override
	public Node_<T> next() {
		// TODO Auto-generated method stub
		return this.next;
	}

}
