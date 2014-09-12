package com.eoe.weekday.entity;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_<T> implements Iterable<T>{
	T[] values; //������ݵ�����
	int index;  //��ǰ������±�
	//��Ĺ��췽������ʼ��
	public ArrayList_() {
		values=(T[]) new Object[0];
		index=0;
	}
	//1.�򼯺������һ��Ԫ��
	public void add(T value){
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1]=value;
	}
	//2.����ָ��������Ԫ��
	public T get(int index){
		if(index<values.length){
			return values[index];
		}
		return null;
	}
	//3.���ؼ��ϵĳ���
	public int size(){
		return values.length;
	}
	//4.��ָ��λ���޸ļ���Ԫ��
	public void  set(int index,T value){
		values[index]=value;
	}
	//5.�����±��Ƴ�ָ��Ԫ��
	public T remove(int index){
		T n=values[index];
		if(index<values.length-1){
			for(int i=index+1;i<values.length;i++){
			    values[i-1]=values[i];
			    }
			 values=Arrays.copyOf(values, values.length-1);
		}
		return n;
	}
	//6.�ж϶���t�Ƿ��ڼ�����
	public boolean contains(T t){
		for(int i=0;i<values.length;i++){
			if(values[i]==t)
				return true;
		}
		return false;
	}
	@Override
	//7.ģ��ʵ��foreach���
	public Iterator<T> iterator() {
		index=0;
		return new Iterator<T>() {

			@Override
			public boolean hasNext() {
				return index<values.length;
			}

			@Override
			public T next() {
				return ArrayList_.this.values[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}
		};
	}
}
	
