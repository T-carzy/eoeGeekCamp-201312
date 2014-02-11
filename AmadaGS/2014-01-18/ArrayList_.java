package com.eoe.weekday.entity;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_<T> implements Iterable<T>{
	T[] values; //存放数据的数组
	int index;  //当前数组的下标
	//类的构造方法，初始化
	public ArrayList_() {
		values=(T[]) new Object[0];
		index=0;
	}
	//1.向集合中添加一个元素
	public void add(T value){
		values=Arrays.copyOf(values, values.length+1);
		values[values.length-1]=value;
	}
	//2.返回指定索引的元素
	public T get(int index){
		if(index<values.length){
			return values[index];
		}
		return null;
	}
	//3.返回集合的长度
	public int size(){
		return values.length;
	}
	//4.在指定位置修改集合元素
	public void  set(int index,T value){
		values[index]=value;
	}
	//5.根据下标移除指定元素
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
	//6.判断对象t是否在集合中
	public boolean contains(T t){
		for(int i=0;i<values.length;i++){
			if(values[i]==t)
				return true;
		}
		return false;
	}
	@Override
	//7.模仿实现foreach语句
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
	
