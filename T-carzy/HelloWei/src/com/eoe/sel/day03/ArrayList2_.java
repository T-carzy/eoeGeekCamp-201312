package com.eoe.sel.day03;

import java.util.Arrays;
import java.util.Collection;

public class ArrayList2_<T> implements Collection_<T> {
	T[] values;
	int index;

	public ArrayList2_() {
	values=(T[]) new Object[0];
	index=0;
	}

	@Override
	public void add(T value) {
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1] =value;
	}

	@Override
	public T next() {
		return null;
	}

}
