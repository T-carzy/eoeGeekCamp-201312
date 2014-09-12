package com.eoe.se1.day04.entity;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_<T> implements Iterable<T> {
	private T[] values;//存放数据的数组
	private int index;//用于遍历集合，表示当前元素的下标
	public ArrayList_() {
		values=(T[]) new Object[0];
		index=0;
	}
	public void add(T value){
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1]=value;
	}
	public T get(int index){
		if(index<values.length){
			return values[index];
		}
		return null;
	}
	public int size(){
		return values.length;
	}
	@Override
	public Iterator<T> iterator() {
		index=0;
		return new Iterator<T>(){
			public void reset(){
				index=0;
			}
			@Override
			public boolean hasNext() {
				
				return index<values.length;
			}

			@Override
			public T next() {
				if(index<values.length){
					return values[index++];
				}
				return null;
			}

			@Override
			public void remove() {
				
			}
			
		};
	}
}
