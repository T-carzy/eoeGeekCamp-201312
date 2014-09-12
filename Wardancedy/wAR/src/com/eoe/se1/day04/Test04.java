package com.eoe.se1.day04;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;


public class Test04 {
	public static void main(String[] args) {
		String text = "father and mother,we are family,";
		text += "grand father and grand mother we are family";
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			Integer count = counts.get(c);
			count = count == null ? 1 : count + 1;
			counts.put(c, count);

		}
		System.out.println("字符\t次数\t百分比");
		Set<java.util.Map.Entry<Character,Integer>> entrys=counts.entrySet();
		for(java.util.Map.Entry<Character, Integer> entry:entrys){
			System.out.println(entry.getKey()+":\t"+entry.getValue()+"\t%");
		}
		}
	}
