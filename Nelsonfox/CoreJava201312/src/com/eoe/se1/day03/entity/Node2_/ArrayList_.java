package com.eoe.se1.day03.entity.Node2_;

import java.util.Arrays;

public class ArrayList_<T> {
T[] values;

	public ArrayList_() {
		values=(T[]) new Object[0];
	}
	//向集合中添加一个元素
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
