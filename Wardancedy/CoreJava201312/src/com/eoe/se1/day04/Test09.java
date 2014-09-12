package com.eoe.se1.day04;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test09 {
	public static void main(String[] args) {
		String text="father and mother,we are family,";
		text+="grand father and grand mother we are family";
		HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
		//循环，统计每个字符出现的次数
		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			Integer count=counts.get(c);
			count=count==null?1:count+1;
			counts.put(c, count);
//			if(count==null){
//				counts.put(c, 1);
//			}else{
//				counts.put(c, count+1);
//			}
		}
		System.out.println("字符\t\t出现次数\t\t百分比");
		Set<Entry<Character,Integer>> entrySets=counts.entrySet();
		for(Entry<Character,Integer> entry:entrySets){
			double percent=100.0*entry.getValue()/text.length();
			percent=Math.round(100*percent)/100.0;
			System.out.println(entry.getKey()+"\t\t"+entry.getValue()+"\t\t"+percent+"%");
		}
	}
}
