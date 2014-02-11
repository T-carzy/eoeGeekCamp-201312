package com.eoe.se1.day04.entity;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_<T> implements Iterable<T> {
	private T[] values;
	private int index;
	public  ArrayList_(){
		values=(T[]) new Object[0];
		index=0;
	}
	public void add(T value){
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1]=value;
	}
	public T get(int index){
		if (index<values.length) {
			return values[index];
		}
		return null;
	}
public int size(){
	return values.length;
}
@Override
public Iterator<T>iterator(){
	return new Iterator<T>() {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<values.length;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			if (index<values.length) {
				return values[index++];
			}
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
}

}
