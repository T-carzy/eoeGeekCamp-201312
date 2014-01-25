package com.eoe.sel.day04;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		String text="father and mother,we are family,";
		text+="grand father and grand mother we are family";
		HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
		for (int i = 0; i <text.length(); i++) {
			char c=text.charAt(i);
			Integer count=counts.get(c);
			count=count==null?1:count+1;
			counts.put(c, count);
		}
		System.out.println("字符\t出现次数\t百分百");
//		Set<Character> keys=counts.keySet();
//		for (Character key : keys) {
//			int value=counts.get(key);
//			double percent=1.0*value*100/text.length();
//			percent=Math.round(percent*100)/100.0;
//			System.out.println(key+"\t"+counts.get(key)+"\t"+percent+"%");
//		}
		Set<Entry<Character, Integer>> entrys=counts.entrySet();
		for (Entry<Character, Integer> entry : entrys) {
			
			double percent=100*entry.getValue()/text.length();
			percent=Math.round(percent*100)/100.0;
			System.out.println(entry.getKey()+"\t"+entry.getValue()+"\t"+percent+"%");
		}
	}
}
