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
		collect.add("��ɺ");
		collect.add("������");
		collect.add("������");
		collect1.add("��ɺ.");
		collect1.add("������.");
		collect1.add("������.");
		for(String s:collect){
			System.out.println(s);
		} 
		if(collect.contains("������")){
			System.out.println("�������ڼ�����");
		}else{
		System.out.println("���������ڼ�����");
		}
	}
}
