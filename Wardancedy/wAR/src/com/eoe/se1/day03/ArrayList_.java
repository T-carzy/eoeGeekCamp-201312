package com.eoe.se1.day03;

import java.util.Arrays;

import ClassTestday02.CopyOfText01;

public class ArrayList_<T> {
	T[] values;
	public ArrayList_() {
		// TODO Auto-generated constructor stub
		values = (T[]) new Object[0];
	}

	public void add() {
		// TODO Auto-generated method stub
		values = Arrays.copyOf(values, values.length + 1);
		values[values.length - 1] = value;
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		if (index < values.length) {
			return values[index];
		}
		return null;
	}

	public int size() {
		return values.length;
	}
}