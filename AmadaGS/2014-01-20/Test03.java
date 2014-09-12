package com.ityw.sel.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Test03 {
	public static void main(String[] args) {
		Collection<String> collect;
		Collection<String> collect1;
//		collect=new ArrayList<String>();
		collect1=new LinkedList<String>();
		collect=new HashSet<String>();
		collect.add("高珊");
		collect.add("刘旭阳");
		collect.add("王骏博");
		collect1.add("高珊.");
		collect1.add("刘旭阳.");
		collect1.add("王骏博.");
		for(String s:collect){
			System.out.println(s);
		} 
		if(collect.contains("刘旭阳")){
			System.out.println("刘旭阳在集合中");
		}else{
		System.out.println("刘旭阳不在集合中");
		}
	}
}
