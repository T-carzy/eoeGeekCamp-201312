package com.ityw.sel.day04;

import java.util.HashMap;
import java.util.Set;

public class Test008 {

	public static void main(String[] args) {
		String text="father and mother,we are family,";
		text+="grand father and grand mother we are family";
		HashMap<Character,Integer> counts=new HashMap<Character, Integer>();
	for (int i = 0; i < text.length(); i++) {
		char c=text.charAt(i);
		Integer count=counts.get(c);
		count=count==null?1:count+1;
		counts.put(c, count);
		System.out.println("�ַ�\t\t���ִ���\t\t�ٷֱ�");
		Set<Character> keys=counts.keySet();
		for(Character key:keys){
			int value=counts.get(key);
			double percent=1.0*value*100/text.length();
			percent=percent*100;
			percent=Math.round(percent);
			percent=percent/100;
			System.out.println(key+"\t\t"+counts.get(key)+"\t\t"+percent+"%");
		}
	}
	}
	}

