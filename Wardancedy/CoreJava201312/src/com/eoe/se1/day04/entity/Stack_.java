package com.eoe.se1.day04.entity;

import java.util.AbstractList;
import java.util.Arrays;

public class Stack_<E> extends AbstractList<E> {
	E[] values;
	int index;
	public Stack_() {
		values=(E[]) new Object[0];
		index=0;
	}
	//»Î’ª
	public void push(E value){
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1]=value;
	}
	//≥ˆ’ª
	public E pop(){
		E t=values[values.length-1];
		values=Arrays.copyOf(values, values.length-1);
		return t;
	}
	@Override
	public E get(int index) {
		if(index<values.length){
			return values[index];
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return values.length;
	}

}
