package com.eoe.se1.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Test03 {
	public static void main(String[] args) {
		Collection<String> collect;
		//collect=new ArrayList<String>();
		//collect=new LinkedList<String>();
		collect=new HashSet<String>();
		collect.add("a");
		collect.add("b");
		collect.add("c");
		for(String c:collect){
			System.out.println(c);
		}
		if(collect.contains("b")){
			System.out.println("b�ڼ�����");
		}else{
			System.out.println("b���Ǽ����е�Ԫ��");
		}
	}
}
