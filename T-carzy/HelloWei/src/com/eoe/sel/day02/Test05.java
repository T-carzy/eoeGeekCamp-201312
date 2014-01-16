package com.eoe.sel.day02;

import java.util.ArrayList;

public class Test05 {

		static ArrayList<Integer_>list1,list2;
	public static void main(String[] args) {
		initList();
		list2=new ArrayList<Integer_>();
		list2.add(list1.get(0));
		list2.add(list1.get(1));
		System.out.println(list1.get(0)==list2.get(0));
		Integer_ i=list1.get(0);
		i.value=222;
		System.out.println(list1.get(0)==list2.get(0));
	}
	private static void initList() {
			list1=new ArrayList<Integer_>();
			list1.add(new Integer_(250));
			list1.add(new Integer_(520));
	}
	static class Integer_ extends Object{
		int value;
		public Integer_(){
			
		}
		public Integer_(int value) {
			super();
			this.value = value;
		}
		
	}

}
